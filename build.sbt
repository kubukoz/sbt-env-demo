val root = project.in(file(".")).settings(envVars += ("KEY" -> "VALUE"), fork := true)
