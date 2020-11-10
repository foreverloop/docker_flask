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