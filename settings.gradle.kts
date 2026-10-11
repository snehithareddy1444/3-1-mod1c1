pluginManagement {

    repositories {

        google()

        mavenCentral()

        gradlePluginPortal()

    }

}

dependencyResolutionManagement {

    repositoriesMode.set(

        RepositoriesMode.FAIL_ON_PROJECT_REPOS

    )

    repositories {

        google()

        mavenCentral()

    }

}

rootProject.name = "mod-1-case-study1"

include(":app")