listView('Ex Seed tab') {
    description('Example listview')

    jobs {
        name('seed_flask')
    }

    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
String[] array1 = ['1a','1b']
String[] array2 = ['2a','2b']
println("${array1[0]}_${array2[0]}")

listView('Flask tab') {
    description('Flask jobs only')

    jobs {
        //name('seed_flask')
        regex(/[Ff]lask.*/)
    }

    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}