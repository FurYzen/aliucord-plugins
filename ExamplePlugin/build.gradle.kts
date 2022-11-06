version = "1.0.0" // Plugin version. Increment this to trigger the updater
description = "An example plugin" // Plugin description that will be shown to user

aliucord {
    // Changelog of your plugin
    changelog.set("""
        Some changelog
    """.trimIndent())


    excludeFromUpdaterJson.set(true)
}
