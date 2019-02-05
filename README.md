# gitea
构建gitea


为用户输出gitea


git submodule init

git submodule add https://github.com/go-gitea/gitea ./submodule/源代码

git submodule update

git submodule sync


--------


具体变量
这是Gitea环境变量的清单。他们改变了Gitea的行为。

在Gitea命令生效之前初始化它们，例如：

GITEA_CUSTOM=/home/gitea/custom ./gitea web
来自Go语言
由于Gitea是用Go编写的，它使用了一些Go变量，例如：

GOOS
GOARCH=amd64
GOPATH
有关每个可用变量的文档，请参阅 Go官方文档。

Gitea文件
GITEA_WORK_DIR：工作目录的绝对路径。
GITEA_CUSTOM：Gitea GITEA_WORK_DIR默认使用/ custom文件夹。使用此变量可更改自定义目录。
GOGS_WORK_DIR：不推荐使用 GITEA_WORK_DIR
GOGS_CUSTOM：不推荐使用 GITEA_CUSTOM
操作系统细节
USER：Gitea将运行的系统用户。用于某些存储库访问字符串。
USERNAME：如果没有USER找到，Gitea将使用USERNAME
HOME：用户主目录路径。该USERPROFILE环境变量在Windows中使用。
仅限Windows
USERPROFILE：用户主目录路径。如果为空，则使用HOMEDRIVE+HOMEPATH
HOMEDRIVE：用于访问主目录的主驱动器路径（C :)
HOMEPATH：给定的主驱动器路径中的主页相对路径
Macaron（Gitea使用的框架）
HOST：主持马卡龙会听
PORT：Port Macaron会听
MACARON_ENV：全局变量，为开发环境与生产环境提供特殊功能。如果MACARON_ENV设置为“”或“development”，则每次请求都会重新编译模板。要获得更高性能，请将MACARON_ENV环境变量设置为“production”。
杂
SKIP_MINWINSVC：如果设置为1，请不要在Windows上作为服务运行。



--------------
自定义 Gitea 配置
Gitea 引用 custom 目录中的自定义配置文件来覆盖配置、模板等默认配置。

如果从二进制部署 Gitea ，则所有默认路径都将相对于该 gitea 二进制文件；如果从发行版安装，则可能会将这些路径修改为Linux文件系统标准。Gitea 将会自动创建包括 custom/ 在内的必要应用目录，应用本身的配置存放在 custom/conf/app.ini 当中。在发行版中可能会以 /etc/gitea/ 的形式为 custom 设置一个符号链接，查看配置详情请移步：

快速备忘单
完整配置清单
如果您在 binary 同目录下无法找到 custom 文件夹，请检查您的 GITEA_CUSTOM 环境变量配置， 因为它可能被配置到了其他地方（可能被一些启动脚本设置指定了目录）。

环境变量清单
注： 必须完全重启 Gitea 以使配置生效。

使用自定义 /robots.txt
将 想要展示的内容 存放在 custom 目录中的 robots.txt 文件来让 Gitea 使用自定义的/robots.txt （默认：空 404）。

使用自定义的公共文件
将自定义的公共文件（比如页面和图片）作为 webroot 放在 custom/public/ 中来让 Gitea 提供这些自定义内容（符号链接将被追踪）。

举例说明：image.png 存放在 custom/public/中，那么它可以通过链接 http://gitea.domain.tld/image.png 访问。

修改默认头像
替换以下目录中的 png 图片： custom/public/img/avatar\_default.png

自定义 Gitea 页面
您可以改变 Gitea custom/templates 的每个单页面。您可以在 Gitea 源码的 templates 目录中找到用于覆盖的模板文件，应用将根据 custom/templates 目录下的路径结构进行匹配和覆盖。

包含在 {{ 和 }} 中的任何语句都是 Gitea 的模板语法，如果您不完全理解这些组件，不建议您对它们进行修改。

添加链接和页签
如果您只是想添加额外的链接到顶部导航栏或额外的选项卡到存储库视图，您可以将它们放在您 custom/templates/custom/ 目录下的 extra_links.tmpl 和 extra_tabs.tmpl 文件中。

举例说明：假设您需要在网站放置一个静态的“关于”页面，您只需将该页面放在您的 “custom/public/“目录下（比如 custom/public/impressum.html）并且将它与 custom/templates/custom/extra_links.tmpl 链接起来即可。

这个链接应当使用一个名为“item”的 class 来匹配当前样式，您可以使用 {{AppSubUrl}} 来获取 base URL: <a class="item" href="{{AppSubUrl}}/impressum.html">Impressum</a>

同理，您可以将页签添加到 extra_tabs.tmpl 中，使用同样的方式来添加页签。它的具体样式需要与 templates/repo/header.tmpl 中已有的其他选项卡的样式匹配 (source in GitHub)

页面的其他新增内容
除了 extra_links.tmpl 和 extra_tabs.tmpl，您可以在您的 custom/templates/custom/ 目录中存放一些其他有用的模板，例如：

header.tmpl，在 <head> 标记结束之前的模板，例如添加自定义CSS文件
body_outer_pre.tmpl，在 <body> 标记开始处的模板
body_inner_pre.tmpl，在顶部导航栏之前，但在主 container 内部的模板，例如添加一个 <div class="full height">
body_inner_post.tmpl，在主 container 结束处的模板
body_outer_post.tmpl，在底部 <footer> 元素之前.
footer.tmpl，在 <body> 标签结束处的模板，可以在这里填写一些附加的 Javascript 脚本。
自定义 gitignores，labels， licenses， locales 以及 readmes
将自定义文件放在 custom/options 下相应子的文件夹中即可

更改 Gitea 外观
Gitea 目前由两种内置主题，分别为默认 gitea 主题和深色主题 arc-green，您可以通过修改 app.ini ui 部分的 DEFAULT_THEME 的值来变更至一个可用的 Gitea 外观。