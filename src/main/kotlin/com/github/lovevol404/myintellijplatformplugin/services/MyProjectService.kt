package com.github.lovevol404.myintellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.lovevol404.myintellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
