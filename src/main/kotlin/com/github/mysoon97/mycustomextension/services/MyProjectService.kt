package com.github.mysoon97.mycustomextension.services

import com.github.mysoon97.mycustomextension.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
