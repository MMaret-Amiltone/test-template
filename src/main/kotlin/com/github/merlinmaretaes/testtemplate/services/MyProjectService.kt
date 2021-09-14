package com.github.merlinmaretaes.testtemplate.services

import com.intellij.openapi.project.Project
import com.github.merlinmaretaes.testtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
