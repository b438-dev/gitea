#!/usr/bin/env bash

git submodule init

git submodule add https://github.com/b438-b/gitea.git ./submodule/源代码

git submodule update

git submodule sync