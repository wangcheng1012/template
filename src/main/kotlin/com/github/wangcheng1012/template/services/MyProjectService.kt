package com.github.wangcheng1012.template.services

import com.github.wangcheng1012.template.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
