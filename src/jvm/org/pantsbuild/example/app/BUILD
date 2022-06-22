kotlin_sources()

deploy_jar(
    name="bin",
    main="org.pantsbuild.example.app.ExampleAppKt",
    dependencies=[
        ":app",  # refers to the `kotlin_sources` target above which has the default name
    ],
)
