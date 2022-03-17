package com.github.asgarov1.commitchecker.services

import com.intellij.openapi.project.Project
import com.github.asgarov1.commitchecker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
