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