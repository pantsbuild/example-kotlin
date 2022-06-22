# example-kotlin

This repository demonstrates how to use Kotlin with Pants. (Pants also supports Java and Scala, which 
are demonstrared in the [`example-jvm` repository](https://github.com/pantsbuild/example-jvm/).)

There are two examples:
- [Kotlin calling into Java plus a JUnit test](src/jvm/org/pantsbuild/example/app/ExampleApp.kt)
- [Serializing/deserializing JSON using the Kotlin serialization compiler plugin](src/jvm/org/pantsbuild/example/json/JsonExample.kt)

This is only one possible way of laying out your project with Pants. See 
[pantsbuild.org/docs/source-roots#examples](https://www.pantsbuild.org/docs/source-roots#examples) 
for some other example layouts.

# Running Pants

You run Pants goals using the `./pants` wrapper script, which will bootstrap the
configured version of Pants if necessary.

# Goals

Pants commands are called _goals_. You can get a list of goals with

```
./pants help goals
```

Most goals take arguments to run on. To run on a single directory, just use the directory name.
To recursively run on a directory and all its subdirectories, add `::` to the end.

For example:

```
./pants lint src: 3rdparty::
```

You can run on all changed files:

```
./pants --changed-since=HEAD lint
```

You can run on all changed files, and any of their "dependees":

```
./pants --changed-since=HEAD --changed-dependees=transitive test
```

# Example Goals

Try these out in this repo!

## Run `ktlint`

```
./pants fmt ::  # Format all files.
./pants fmt src/jvm  # Format only files in this directory (non-recursively).
./pants lint src/jvm::  # Check that all files under `src/jvm` are formatted (recursively).
```

## Check compilation

```
./pants check ::  # Compile everything.
./pants check src/jvm/org/pantsbuild/example/json/JsonExample.kt  # Compile a file and its deps.
```

## Create a binary file

Writes the result to the `dist/` folder.

```
./pants package src/jvm/org/pantsbuild/example/json  # Build binaries in this directory.
./pants package ::  # Create all binaries.
```

## Determine dependencies

```
./pants dependencies src/jvm::
./pants dependencies --transitive src/jvm::
```

## Determine dependees

That is, find what code depends on a particular files.

```
./pants dependees src/jvm/org/pantsbuild/example/json::
./pants dependees --transitive src/jvm/org/pantsbuild/example/json/JsonExample.kt
```

## Count lines of code

```
./pants count-loc ::
```
