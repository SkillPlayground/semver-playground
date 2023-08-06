plugins { //
    alias(libs.plugins.semver)
}

semver {
    tagPrefix.set("v")
    mapVersion { gradleVersion -> "${gradleVersion.copy(metadata = "M3T4D4T4")}" }
}
