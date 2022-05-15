# Kotlin standard library: The following three `jvm_artifacts` must provided in any resolve
# which contains Kotlin targets. Pants will automatially infer a dependency between a Kotlin
# target and these jars.
#
# The version of these `jvm_artifact` targets must match the Kotlin version set in pants.toml
# via the `[kotlin].version_for_resolve` option.

jvm_artifact(
    name="org.jetbrains.kotlin_kotlin-stdlib",
    group="org.jetbrains.kotlin",
    artifact="kotlin-stdlib",
    version="1.6.21",
)

jvm_artifact(
    name="org.jetbrains.kotlin_kotlin-reflect",
    group="org.jetbrains.kotlin",
    artifact="kotlin-reflect",
    version="1.6.21",
)

jvm_artifact(
    name="org.jetbrains.kotlin_kotlin-script-runtime",
    group="org.jetbrains.kotlin",
    artifact="kotlin-script-runtime",
    version="1.6.21",
)

# Pants supports using Kotlin compiler plugins. To use a plugin, declare a `kotlinc_plugin` target
# for the plugin's metadata and point that target at a `jvm_artifact` for the actual plugin jar.
#
# The Maven coordinates for the standard Kotlin plugins are:
#
# * All-open: `org.jetbrains.kotlin:kotlin-allopen:VERSION` (ID: `all-open`)
# * No-arg: `org.jetbrains.kotlin:kotlin-noarg:VERSION` (ID: `no-arg`)
# * SAM with receiver: `org.jetbrains.kotlin:kotlin-sam-with-receiver:VERSION` (ID: `sam-with-receiver`)
# * kapt (annotation processor): `org.jetbrains.kotlin:org.jetbrains.kotlin:kotlin-annotation-processing-embeddable:VERSION` (ID: `kapt3`)
# * Seralization: `org.jetbrains.kotlin:kotlin-serialization:VERSION` (ID: `serialization`)
#
# For this example, we declare the Serialization plugin so it can be used in the JSON example.

jvm_artifact(
    name="org.jetbrains.kotlin_kotlin-serialization",
    group="org.jetbrains.kotlin",
    artifact="kotlin-serialization",
    version="1.6.21",
)

kotlinc_plugin(
    name="serialization",
    # TODO: plugin_id is required but should not be. It should default to the target name.
    plugin_id="serialization",
    artifact="3rdparty/jvm/org/jetbrains/kotlin:org.jetbrains.kotlin_kotlin-serialization",
)
