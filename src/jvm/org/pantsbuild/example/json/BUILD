kotlin_sources(
    # Plugins to kotlinc may be defined on target-by-target basis by providing the plugin's
    # ID via the `kotlinc_plugins` field.
    kotlinc_plugins=["serialization"],
)

deploy_jar(
    name="bin",
    main="org.pantsbuild.example.json.JsonExampleKt",
    dependencies=[
        ":json",
    ],
)
