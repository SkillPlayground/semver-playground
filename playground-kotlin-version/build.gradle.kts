import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion

plugins { //
    alias(libs.plugins.semver)
    alias(libs.plugins.kotlin)
}

semver {
    tagPrefix.set("k")
    mapVersion { gradleVersion ->
        val isDirty: Boolean = gradleVersion.metadata == "DIRTY"
        val metadata: String =
            if (isDirty) "${getKotlinPluginVersion()}+DIRTY" else getKotlinPluginVersion()
        "${gradleVersion.copy(metadata = metadata)}"
    }
}
