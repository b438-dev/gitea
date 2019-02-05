#!/usr/bin/env bash

git submodule init

git submodule add https://github.com/go-gitea/gitea ./submodule/源代码

git submodule update

git submodule sync