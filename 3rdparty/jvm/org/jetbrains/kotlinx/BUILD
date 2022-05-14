# The Serialization plugin also requires a runtime library jar in addition to the plugin jar.
jvm_artifact(
    name="org.jetbrains.kotlinx_kotlinx-serialization-json",
    group="org.jetbrains.kotlinx",
    artifact="kotlinx-serialization-json",
    version="1.3.2",

    # Because this artifact provides a package which does not match its `group`, we explicitly list it
    # here, which allows inference to recognize that imports of this package are provided by this
    # artifact. See https://www.pantsbuild.org/v2.11/docs/reference-jvm_artifact#codepackagescode
    # for more information.
    packages=[
      "kotlinx.serialization.json.**",
    ],
)
