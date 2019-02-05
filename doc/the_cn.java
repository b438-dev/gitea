; 该文件列出了Gitea使用的默认值
        ; 将所需的部分复制到您自己的app.ini（默认为custom / conf / app.ini）
        ; 并根据需要进行修改。

        ; 有关其他文档，请参阅https://docs.gitea.io/en-us/config-cheat-sheet/。

        ; 每个页面标题中显示的应用程序名称
        APP_NAME = Gitea：Git喝一杯茶
        ; 如果您在本地运行，请更改它
        RUN_USER = git
        ; “dev”，“prod”或“test”，默认为“dev”
        RUN_MODE = dev

        [储存库]
        ROOT =
        SCRIPT_TYPE = bash
        ; 默认ANSI字符集
        ANSI_CHARSET =
        ; 强制每个新存储库都是私有的
        FORCE_PRIVATE = false
        ; 创建新存储库时的默认隐私设置，允许值：last，private，public。默认值为last，表示使用的最后一个设置。
        DEFAULT_PRIVATE =最后
        ; 在创建时应用的每个用户的全局存储库限制。-1表示没有限制
        MAX_CREATION_LIMIT = -1
        ; 镜像同步队列长度，如果镜像同步开始挂起则增加
        MIRROR_QUEUE_LENGTH = 1000
        ; 补丁测试队列长度，如果拉请求补丁测试开始挂起则增加
        PULL_REQUEST_QUEUE_LENGTH = 1000
        ; 首选许可证放在列表顶部
        ; 此处的名称必须与conf / license或custom / conf / license中的文件名匹配
        PREFERRED_LICENSES = Apache许可证2.0，MIT许可证
        ; 禁用使用H​​TTP协议与存储库交互的功能
        DISABLE_HTTP_GIT = false
        ; Access-Control-Allow-Origin标头的值，默认不显示
        ; 警告：如果您没有给它正确的值，这可能对您的网站有害。
        ACCESS_CONTROL_ALLOW_ORIGIN =
        ; 当使用默认SSH端口时，强制ssh：//克隆url而不是scp-style uri
        USE_COMPAT_SSH_URI = false

        [repository.editor]
        ; 应在CodeMirror编辑器中包装行的文件扩展名列表
        ; 用逗号分隔扩展名。要在没有扩展名的情况下对文件进行换行，只需输入逗号即可
        LINE_WRAP_EXTENSIONS = .txt，.md，.markdown，.mdown，.mkd，
        ; 具有与之关联的预览API的有效文件模式，例如api / v1 / markdown
        ; 用逗号分隔值。如果文件扩展名不匹配，则不会显示编辑模式下的预览选项卡
        PREVIEWABLE_FILE_MODES =降价

        [repository.local]
        ; 本地存储库副本的路径。默认为`tmp / local-repo`
        LOCAL_COPY_PATH = tmp / local-repo
        ; 本地维基拷贝的路径。默认为`tmp / local-wiki`
        LOCAL_WIKI_PATH = tmp / local-wiki

        [repository.upload]
        ; 是否启用了存储库文件上载。默认为“true”
        ENABLED = true
        ; 上传路径。默认为`data / tmp / uploads`（在gitea重启时tmp被删除）
        TEMP_PATH = data / tmp / uploads
        ; 一个或多个允许的类型，例如image / jpeg | image / png。没有什么意味着任何文件类型
        ALLOWED_TYPES =
        ; 每个文件的最大大小（以兆字节为单位）。默认为3MB
        FILE_MAX_SIZE = 3
        ; 每次上传的最大文件数。默认为5
        MAX_FILES = 5

        [repository.pull请求]
        ; Pull Request标题中使用的前缀列表，将其标记为Work In Progress
        WORK_IN_PROGRESS_PREFIXES = WIP：[WIP]

        [UI]
        ; 一个探索页面上显示的存储库数量
        EXPLORE_PAGING_NUM = 20
        ; 一页上显示的问题数
        ISSUE_PAGING_NUM = 10
        ; 一个活动源中显示的最大提交数
        FEED_MAX_COMMIT_NUM = 5
        ; 提交图中显示的最大提交数。
        GRAPH_MAX_COMMIT_NUM = 100
        ; 为代码注释显示的代码行数
        CODE_COMMENT_LINES = 4
        ; 'theme-color`元标记的值，由Android> = 5.0使用
        ; “无”或“禁用”等无效颜色将具有默认样式
        ; 更多信息：https：//developers.google.com/web/updates/2014/11/Support-for-theme-color-in-Chrome-39-for-Android
        THEME_COLOR_META_TAG =`＃6cc644`
        ; 要显示的文件的最大大小（默认为8MiB）
        MAX_DISPLAY_FILE_SIZE = 8388608
        ; 是否应在“探索用户”页面中显示用户的电子邮件
        SHOW_USER_EMAIL = true
        ; 设置Gitea安装的默认主题
        DEFAULT_THEME = gitea
        ; 所有主题。无论“DEFAULT_THEME”的值如何，都允许用户选择个性化主题。
        主题= gitea，arc-green

        [ui.admin]
        ; 一页显示的用户数
        USER_PAGING_NUM = 50
        ; 一页显示的回购数量
        REPO_PAGING_NUM = 50
        ; 一页上显示的通知数
        NOTICE_PAGING_NUM = 25
        ; 在一个页面上显示的组织数
        ORG_PAGING_NUM = 50

        [ui.user]
        ; 一页显示的回购数量
        REPO_PAGING_NUM = 15

        [ui.meta]
        AUTHOR = Gitea  -  Git喝一杯茶
        DESCRIPTION = Gitea（带一杯茶的Git）是一个用Go编写的无痛自我托管的Git服务
        关键词= go，git，自托管，gitea

        [降价]
        ; 启用硬换行符延长
        ENABLE_HARD_LINE_BREAK = false
        ; 呈现Markdown时允许作为链接的自定义URL方案的列表
        ; 例如git，magnet
        CUSTOM_URL_SCHEMES =
        ; 应作为Markdown呈现/编辑的文件扩展名列表
        ; 用逗号分隔扩展名。要将没有任何扩展名的文件渲染为markdown，只需输入逗号即可
        FILE_EXTENSIONS = .md，.markdown，.mdown，.mkd

        [服务器]
        ; 服务器侦听的协议。'http'，'https'，'unix'或'fcgi'之一。
        PROTOCOL = http
        DOMAIN = localhost
        ROOT_URL =％（PROTOCOL）s：//％（DOMAIN）s：％（HTTP_PORT）s /
        ; 要听的地址。IPv4 / IPv6地址或unix套接字的路径。
        HTTP_ADDR = 0.0.0.0
        HTTP_PORT = 3000
        ; 如果REDIRECT_OTHER_PORT为true，则PROTOCOL设置为https http服务器
        ; 将在PORT_TO_REDIRECT上启动，它会将纯粹的，非安全的http请求重定向到main
        ; ROOT_URL。REDIRECT_OTHER_PORT的默认值为false，80表示默认值
        ; PORT_TO_REDIRECT。
        REDIRECT_OTHER_PORT = false
        PORT_TO_REDIRECT = 80
        ; unix socket的权限
        UNIX_SOCKET_PERMISSION = 666
        ; 访问Web服务的Gitea工作者的本地（DMZ）URL（例如SSH更新）。
        ; 在大多数情况下，您无需更改默认值。
        ; 仅当您的SSH服务器节点与HTTP节点不同时才更改它。
        ; 如果PROTOCOL设置为'unix'，请不要设置此变量。
        LOCAL_ROOT_URL =％（PROTOCOL）s：//％（HTTP_ADDR）s：％（HTTP_PORT）s /
        ; 不可用时禁用SSH功能
        DISABLE_SSH = false
        ; 是否使用内置SSH服务器。
        START_SSH_SERVER = false
        ; 用于内置SSH服务器的用户名。如果为空，则为RUN_USER的值。
        BUILTIN_SSH_SERVER_USER =
        ; 要在克隆URL中公开的域名
        SSH_DOMAIN =％（DOMAIN）s
        ; 内置SSH服务器应该监听的网络接口
        SSH_LISTEN_HOST =
        ; 要在克隆URL中公开的端口号
        SSH_PORT = 22
        ; 内置SSH服务器应该监听的端口号
        SSH_LISTEN_PORT =％（SSH_PORT）s
        ; SSH目录的根路径，默认为'〜/ .ssh'，但您必须使用'/home/git/.ssh'。
        SSH_ROOT_PATH =
        ; Gitea默认情况下会在不使用内部ssh服务器时创建authorized_keys文件
        ; 如果您打算使用AuthorizedKeysCommand功能，则应关闭此功能。
        SSH_CREATE_AUTHORIZED_KEYS_FILE = true
        ; 对于内置SSH服务器，请选择支持SSH连接的密码，
        ; 对于系统SSH，此设置无效
        SSH_SERVER_CIPHERS = aes128-ctr，aes192-ctr，aes256-ctr，aes128-gcm @ openssh.com，arcfour256，arcfour128
        ; 对于内置SSH服务器，选择密钥交换算法以支持SSH连接，
        ; 对于系统SSH，此设置无效
        SSH_SERVER_KEY_EXCHANGES = diffie-hellman-group1-sha1，diffie-hellman-group14-sha1，ecdh-sha2-nistp256，ecdh-sha2-nistp384，ecdh-sha2-nistp521，curve25519-sha256@libssh.org
; 对于内置SSH服务器，选择支持SSH连接的MAC，
        ; 对于系统SSH，此设置无效
        SSH_SERVER_MACS = hmac-sha2-256-etm@openssh.com,hmac-sha2-256,hmac-sha1,hmac-sha1-96
        ; 使用ssh-keygen测试公钥时创建临时文件的目录，
        ; default是系统临时目录。
        SSH_KEY_TEST_PATH =
        ; ssh-keygen的路径，默认为'ssh-keygen'，这意味着shell负责找出要调用的那个。
        SSH_KEYGEN_PATH = ssh-keygen
        ; 重写所有密钥时启用SSH授权密钥备份，默认为true
        SSH_BACKUP_AUTHORIZED_KEYS = true
        ; 允许将SSH克隆URL暴露给匿名访问者，默认为false
        SSH_EXPOSE_ANONYMOUS = false
        ; 指示是否使用相应类型检查最小密钥大小
        MINIMUM_KEY_SIZE_CHECK = false
        ; 即使在“prod”模式下也禁用CDN
        OFFLINE_MODE = false
        DISABLE_ROUTER_LOG = false
        ; 生成步骤：
        ; $ ./gitea cert -ca = true -duration = 8760h0m0s -host = myhost.example.com
        ;
        ; 或者从Windows证书存储区导出的.pfx文件（执行
        ; 不要忘记导出私钥）：
        ; $ openssl pkcs12 -in cert.pfx -out cert.pem -nokeys
        ; $ openssl pkcs12 -in cert.pfx -out key.pem -nocerts -nodes
        CERT_FILE = custom / https / cert.pem
        KEY_FILE = custom / https / key.pem
        ; 根目录包含模板和静态文件。
        ; default是执行Gitea的路径
        STATIC_ROOT_PATH =
        ; App数据的默认路径
        APP_DATA_PATH =数据
        ; 应用程序级GZIP支持
        ENABLE_GZIP = false
        ; 应用程序分析（内存和CPU）
        ; 对于“web”命令，它侦听localhost：6060
        ; 对于“serve”命令，它在PPROF_DATA_PATH转储到磁盘为（cpuprofile | memprofile）_ <用户名> _ <临时id>
ENABLE_PPROF = false
        ; PPROF_DATA_PATH，当您启动gitea作为服务时使用绝对路径
        PPROF_DATA_PATH = data / tmp / pprof
        ; 登陆页面，可以是“家”，“探索”或“组织”
        LANDING_PAGE =主页
        ; 启用git-lfs支持。true或false，默认为false。
        LFS_START_SERVER = false
        ; 您的lfs文件所在的位置，默认为data / lfs。
        LFS_CONTENT_PATH = data / lfs
        ; LFS身份验证密码，请自行更改
        LFS_JWT_SECRET =
        ; LFS身份验证有效期（在time.Duration中），推送时间超过此可能会失败。
        LFS_HTTP_AUTH_EXPIRY = 20米

        ; 定义允许的算法及其最小密钥长度（使用-1禁用类型）
        [ssh.minimum_key_sizes]
        ED25519 = 256
        ECDSA = 256
        RSA = 2048
        DSA = 1024

        [数据库]
        ; 无论是“mysql”，“postgres”，“mssql”还是“sqlite3”，都是您的选择
        DB_TYPE = mysql
        主机= 127.0.0.1:3306
        NAME = gitea
        USER = root
        ; 如果您在密码中使用特殊字符，请使用PASSWD =`您的密码`进行引用。
        PASSWD =
        ; 对于Postgres，“禁用”（默认），“需要”或“验证完整”
        ; 对于MySQL，“false”（默认），“true”或“skip-verify”
        SSL_MODE =禁用
        ; 对于“sqlite3”和“tidb”，在启动gitea作为服务时使用绝对路径
        PATH = data / gitea.db
        ; 仅适用于“sqlite3”。查询超时
        SQLITE_TIMEOUT = 500
        ; 对于迭代缓冲区，默认值为50
        ITERATE_BUFFER_SIZE = 50
        ; 显示数据库生成的SQL
        LOG_SQL = true
        ; 最大数据库连接重试次数
        DB_RETRIES = 10
        ; 每次DB重试的退避时间（time.Duration）
        DB_RETRY_BACKOFF = 3s


        [索引]
        ISSUE_INDEXER_PATH = indexers / issues.bleve
        ; repo indexer默认禁用，因为它占用了大量磁盘空间
        REPO_INDEXER_ENABLED = false
        REPO_INDEXER_PATH = indexers / repos.bleve
        UPDATE_BUFFER_LEN = 20
        MAX_FILE_SIZE = 1048576

        [管理员]
        ; 禁止常规（非管理员）用户创建组织。
        DISABLE_REGULAR_ORG_CREATION = false

        [安全]
        ; 是否已禁用安装程序
        INSTALL_LOCK = false
        ; !!更改此设置以保证您的用户数据安全!!
        SECRET_KEY =！＃@ FDEWREWR＆*（
        ; 多久要记住用户在需要重新登录之前登录（以天为单位）
        LOGIN_REMEMBER_DAYS = 7
        COOKIE_USERNAME = gitea_awesome
        COOKIE_REMEMBER_NAME = gitea_incredible
        ; 反向代理身份验证标头名称的用户名
        REVERSE_PROXY_AUTHENTICATION_USER = X-WEBAUTH-USER
        REVERSE_PROXY_AUTHENTICATION_EMAIL = X-WEBAUTH-EMAIL
        ; 新用户的最小密码长度
        MIN_PASSWORD_LENGTH = 6
        ; 设置为true以允许用户导入本地服务器路径
        IMPORT_LOCAL_PATHS = false
        ; 设置为true以防止所有用户（包括管理员）创建自定义git挂钩
        DISABLE_GIT_HOOKS = false

        [OpenID的]
        ;
        ; OpenID是一种开放，标准和分散的身份验证协议。
        ; 您的身份是您提供的网页的地址，其描述如下
        ; 如何证明你掌控了那个页面。
        ;
        ; 有关更多信息：https：//en.wikipedia.org/wiki/OpenID
        ;
        ; 当前实现支持OpenID-2.0
        ;
        ; 在撰写本文时对工作提供者进行了测试：
        ;  - 任何GNUSocial节点（your.hostname.tld / username）
        ;  - 任何SimpleID提供程序（http://simpleid.koinic.net）
        ;  -  http://openid.org.cn/
        ;  -  openid.stackexchange.com
        ;  -  login.launchpad.net
        ;  -  <username> .livejournal.com
        ;
        ; 是否允许通过OpenID登录
        ENABLE_OPENID_SIGNIN = true
        ; 是否允许通过OpenID注册
        ; 不要包括依赖rhw DISABLE_REGISTRATION设置
        ; ENABLE_OPENID_SIGNUP = true
        ; 允许的URI模式（POSIX正则表达式）。
        ; 空间分开。
        ; 如果非空白，则只允许这些。
        ; 示例值：trusted.domain.org trusted.domain.net
        WHITELISTED_URIS =
        ; 禁止的URI模式（POSIX正则表达式）。
        ; 空间分开。
        ; 仅在WHITELISTED_URIS为空时使用。
        ; 示例值：loadaverage.org/badguy stackexchange.com/.*spammer
        BLACKLISTED_URIS =

        [服务]
        ; 确认帐户/电子邮件注册的时间限制
        ACTIVE_CODE_LIVE_MINUTES = 180
        ; 执行重置忘记密码的时间限制
        RESET_PASSWD_CODE_LIVE_MINUTES = 180
        ; 新用户是否需要在注册时确认其电子邮件。
        REGISTER_EMAIL_CONFIRM = false
        ; 允许用于在Gitea实例上注册的域名列表
        ; gitea.io，example.com
        EMAIL_DOMAIN_WHITELIST =
        ; 禁止注册，仅允许管理员创建帐户。
        DISABLE_REGISTRATION = false
        ; 仅允许使用第三方服务进行注册，仅当DISABLE_REGISTRATION为false时才有效
        ALLOW_ONLY_EXTERNAL_REGISTRATION = false
        ; 用户必须登录才能查看任何内容。
        REQUIRE_SIGNIN_VIEW = false
        ; 邮件通知
        ENABLE_NOTIFY_MAIL = false
        ; 更多细节：https：//github.com/gogits/gogs/issues/165
        ENABLE_REVERSE_PROXY_AUTHENTICATION = false
        ENABLE_REVERSE_PROXY_AUTO_REGISTRATION = false
        ENABLE_REVERSE_PROXY_EMAIL = false
        ; 启用验证码验证以进行注册
        ENABLE_CAPTCHA = false
        ; 您要使用的验证码类型。选项：image，recaptcha
        CAPTCHA_TYPE =图片
        ; 启用recaptcha以使用Google的重新接收服务
        ; 转到https://www.google.com/recaptcha/admin注册密钥
        RECAPTCHA_SECRET =
        RECAPTCHA_SITEKEY =
        ; KeepEmailPrivate的默认值
        ; 每个新用户都会将此设置的值复制到其配置文件中
        DEFAULT_KEEP_EMAIL_PRIVATE = false
        ; AllowCreateOrganization的默认值
        ; 每个新用户都将拥有根据此设置创建组织的权限
        DEFAULT_ALLOW_CREATE_ORGANIZATION = true
        ; EnableDependencies的默认值
        ; 默认情况下，存储库将根据此设置使用依赖项
        DEFAULT_ENABLE_DEPENDENCIES = true
        ; 在用户配置文件上启用热图。
        ENABLE_USER_HEATMAP = true
        ; 启用时间跟踪
        ENABLE_TIMETRACKING = true
        ; EnableTimetracking的默认值
        ; 默认情况下，存储库将根据此设置使用时间跟踪
        DEFAULT_ENABLE_TIMETRACKING = true
        ; AllowOnlyContributorsToTrackTime的默认值
        ; 只有具有写入权限的用户才能跟踪时间（如果这是真的）
        DEFAULT_ALLOW_ONLY_CONTRIBUTORS_TO_TRACK_TIME = true
        ; git日志中用户电子邮件地址的域部分的默认值
        ; 如果他已将KeepEmailPrivate设置为true。用户的电子邮件将替换为
        ; 以小写形式连接用户名，“@”和NO_REPLY_ADDRESS。
        NO_REPLY_ADDRESS = noreply.example.org
        ; 显示注册按钮
        SHOW_REGISTRATION_BUTTON = true
        ; AutoWatchNewRepos的默认值
        ; 在向团队添加回购或创建新回购时，所有团队成员都会观看
        ; 如果启用则自动repo
        AUTO_WATCH_NEW_REPOS = true

        [网络挂接]
        ; 钩子任务队列长度，如果webhook射击开始挂起则增加
        QUEUE_LENGTH = 1000
        ; 以秒为单位提供超时
        DELIVER_TIMEOUT = 5
        ; 允许不安全的认证
        SKIP_TLS_VERIFY = false
        ; 每页中的历史信息数
        PAGING_NUM = 10

        [邮包]
        ENABLED = false
        ; 通道的缓冲区长度，如果您不知道它是什么，请保持原样。
        SEND_BUFFER_LEN = 100
        ; 邮件标题中显示的名称
        SUBJECT =％（APP_NAME）s
        ; 邮件服务器
        ; Gmail：smtp.gmail.com：587
        ; QQ：smtp.qq.com：465
        ; 请注意，如果端口以“465”结尾，则将使用SMTPS。根据RFC 6409，建议在端口587上使用STARTTLS。如果服务器支持STARTTLS，则始终使用它。
        主机=
        ; 主机名不同时禁用HELO操作。
        DISABLE_HELO =
        ; HELO操作的自定义主机名，如果未提供任何值，则从系统中检索一个。
        HELO_HOSTNAME =
        ; 不要验证服务器的证书。仅用于自签名证书
        SKIP_VERIFY =
        ; 使用客户端证书
        USE_CERTIFICATE = false
        CERT_FILE = custom / mailer / cert.pem
        KEY_FILE = custom / mailer / key.pem
        ; SMTP连接是否应使用TLS
        IS_TLS_ENABLED = false
        ; 来自地址的邮件，RFC 5322.这可以只是一个电子邮件地址，或者是“名称”<email@example.com>`格式
FROM =
; 邮件用户名和密码
USER =
; 如果您在密码中使用特殊字符，请使用PASSWD =`您的密码`进行引用。
PASSWD =
; 将邮件作为纯文本发送
SEND_AS_PLAIN_TEXT = false
; 设置邮件程序类型（SMTP，sendmail或虚拟只发送到日志）
MAILER_TYPE = smtp
; 指定备用sendmail二进制文件
SENDMAIL_PATH = sendmail
; 指定任何额外的sendmail参数
SENDMAIL_ARGS =

[缓存]
; “memory”，“redis”或“memcache”，默认为“memory”
ADAPTER =记忆
; 仅适用于“内存”，GC间隔（秒），默认值为60
INTERVAL = 60
; 对于“redis”和“memcache”，连接主机地址
; redis：network = tcp，addr =：6379，password = macaron，db = 0，pool_size = 100，idle_timeout = 180
; memcache：`127.0.0.1：11211`
主机=
; 如果不使用，则将时间保留在缓存中，默认为16小时。
; 将其设置为0将禁用缓存
ITEM_TTL = 16h

[会议]
; “memory”，“file”或“redis”，默认为“memory”
提供者=记忆
; 提供者配置选项
; 内存：还没有任何配置
; file：会话文件路径，例如`data / sessions`
; redis：network = tcp，addr =：6379，password = macaron，db = 0，pool_size = 100，idle_timeout = 180
; mysql：go-sql-driver / mysql dsn config string，例如`root：password @ / session_table`
PROVIDER_CONFIG =数据/会话
; 会话cookie名称
COOKIE_NAME = i_like_gitea
; 如果仅使用https中的会话，则默认为false
COOKIE_SECURE = false
; 启用set cookie，默认为true
ENABLE_SET_COOKIE = true
; 会话GC时间间隔（秒），默认为86400（1天）
GC_INTERVAL_TIME = 86400
; 会话生命周期以秒为单位，默认为86400（1天）
SESSION_LIFE_TIME = 86400

[图片]
AVATAR_UPLOAD_PATH =数据/头像
; 上传的头像的最大宽度和高度。这是为了限制RAM的数量
; 在调整图像大小时使用。
AVATAR_MAX_WIDTH = 4096
AVATAR_MAX_HEIGHT = 3072
; 中国用户可以选择“duoshu”
; 或自定义头像源，如：http：//cn.gravatar.com/avatar/
GRAVATAR_SOURCE = gravatar
; 在离线模式下，此值始终为true。
DISABLE_GRAVATAR = false
; 联合头像查找使用DNS来发现关联的头像
; 有关电子邮件，请参阅https://www.libravatar.org
; 在离线模式或禁用Gravatar时，此值始终为false。
ENABLE_FEDERATED_AVATAR = false

[附件]
; 是否启用附件。默认为“true”
ENABLED = true
; 附件的路径。默认为`data / attachments`
PATH =数据/附件
; 一个或多个允许的类型，例如image / jpeg | image / png
ALLOWED_TYPES = image / jpeg | image / png | application / zip | application / gzip
; 每个文件的最大大小。默认为4MB
MAX_SIZE = 4
; 每次上传的最大文件数。默认为5
MAX_FILES = 5

[时间]
; 指定完全输出日期的格式。默认为RFC1123
; 特殊支持的值是ANSIC，UnixDate，RubyDate，RFC822，RFC822Z，RFC850，RFC1123，RFC1123Z，RFC3339，RFC3339Nano，Kitchen，Stamp，StampMilli，StampMicro和StampNano
; 有关格式的更多信息，请参阅http://golang.org/pkg/time/#pkg-constants
格式=

[日志]
ROOT_PATH =
; “console”，“file”，“conn”，“smtp”或“database”，默认为“console”
; 使用逗号分隔多个模式，例如“console，file”
MODE =控制台
; 通道的缓冲区长度，如果您不知道它是什么，请保持原样。
BUFFER_LEN = 10000
; “跟踪”，“调试”，“信息”，“警告”，“错误”，“严重”，默认为“跟踪”
LEVEL =跟踪

; 仅适用于“控制台”模式
[log.console]
等级=

; 仅适用于“文件”模式
[log.file]
等级=
; 这使自动日志旋转（切换以下选项），默认为true
LOG_ROTATE = true
; 单个文件中的最大行数，默认为1000000
MAX_LINES = 1000000
; 单个文件的最大大小移位，默认为28表示1 << 28,256MB
MAX_SIZE_SHIFT = 28
; 每日段日志，默认为true
DAILY_ROTATE = true
; n天后删除日志文件，默认为7
MAX_DAYS = 7

; 仅适用于“conn”模式
[log.conn]
等级=
; 为每条消息重新连接主机，默认为false
RECONNECT_ON_MSG = false
; 连接丢失时尝试重新连接，默认为false
RECONNECT = false
; “tcp”，“unix”或“udp”，默认为“tcp”
PROTOCOL = tcp
; 主机地址
ADDR =

; 仅适用于“smtp”模式
[log.smtp]
等级=
; 邮件标题中显示的名称，默认为“来自服务器的诊断消息”
SUBJECT =来自服务器的诊断消息
; 邮件服务器
主机=
; 邮件用户名和密码
USER =
; 如果您在密码中使用特殊字符，请使用PASSWD =`您的密码`进行引用。
PASSWD =
; 接收者可以是一个或多个，例如1 @ example.com，2 @ example.com
RECEIVERS =

; 仅适用于“数据库”模式
[log.database]
等级=
; “mysql”或“postgres”
DRIVER =
; 基于xorm，例如：root：root @ localhost / gitea？charset = utf8
CONN =

[cron的]
; 定期启用运行cron任务。
ENABLED = true
; Gitea启动时运行cron任务。
RUN_AT_START = false

; 更新镜像
[cron.update_mirrors]
SCHEDULE = @every 10m

; 存储库运行状况检查
[cron.repo_health_check]
SCHEDULE =每24小时一次
TIMEOUT = 60s
; 命令'git fsck'的参数，例如“--unreachable --tags”
; 有关更多信息，请访问http://git-scm.com/docs/git-fsck
ARGS =

; 检查存储库统计信
[cron.check_repo_stats]
RUN_AT_START = true
SCHEDULE =每24小时一次

; 清理旧的存储库档案
[cron.archive_cleanup]
; 是否启用该作业
ENABLED = true
; 是否始终在启动时至少运行一次（如果已启用）
RUN_AT_START = true
; 作业运行的时间间隔
SCHEDULE =每24小时一次
; 创建超过OLDER_THAN之前的档案可能会被删除
OLDER_THAN = 24小时

; 同步外部用户数据（仅支持LDAP用户同步）
[cron.sync_external_users]
; 启动服务器时同步外部用户数据（默认为false）
RUN_AT_START = false
; 间隔作为每次同步之间的持续时间（默认每24小时）
SCHEDULE =每24小时一次
; 创建新用户，更新现有用户数据并禁用不在外部源中的用户（默认）
; 或者，如果UPDATE_EXISTING设置为false，则仅创建新用户
UPDATE_EXISTING = true

[GIT中]
; 禁用已添加和删除更改的突出显示
DISABLE_DIFF_HIGHLIGHT = false
; 差异视图中单个文件中允许的最大行数
MAX_GIT_DIFF_LINES = 1000
; 差异视图中一行中允许的最大字符数
MAX_GIT_DIFF_LINE_CHARACTERS = 5000
; 差异视图中显示的最大文件数
MAX_GIT_DIFF_FILES = 100
; 命令'git gc'的参数，例如“--aggressive --auto”
; 有关更多信息，请访问http://git-scm.com/docs/git-gc/
GC_ARGS =

; 操作超时（秒）
[git.timeout]
MIGRATE = 600
MIRROR = 300
CLONE = 300
PULL = 300
GC = 60

[镜子]
; 默认间隔为每次检查之间的持续时间
DEFAULT_INTERVAL = 8h
; 作为持续时间的最小间隔必须> 1m
MIN_INTERVAL = 10米

[API]
; 启用S​​wagger。对或错; 默认为true。
ENABLE_SWAGGER = true
; 页面中的最大项目数
MAX_RESPONSE_ITEMS = 50
; api的默认分页号
DEFAULT_PAGING_NUM = 30

[I18N]
LANGS = en-US，zh-CN，zh-HK，zh-TW，de-DE，fr-FR，nl-NL，lv-LV，ru-RU，uk-UA，ja-JP，es-ES， PT-BR，PL-PL，BG-BG，它-IT，FI-FI，TR-TR，CS-CZ，SR-SP，SV-SE，KO-KR
NAMES = English，简体中文，繁体中文（香港），繁体中文（台湾），Deutsch，français，Nederlands，latviešu，русский，Українська，日本语，español，portuguêsdoBrasil，polski，български，italiano，suomi，Türkçe， čeština，српски，瑞典语，한국어

; 用于datetimepicker
[i18n.datelang]
en-US = en
zh-CN = zh
zh-HK = zh-HK
zh-TW = zh-TW
de-DE = de
fr-FR = fr
nl-NL = nl
lv-LV = lv
ru-RU = ru
uk-UA =英国
ja-JP = ja
es-ES = es
pt-BR = pt-BR
pl-PL = pl
bg-BG = bg
它-IT =它
fi-FI = fi
tr-TR = tr
cs-CZ = cs-CZ
sr-SP = sr
sv-SE = sv
ko-KR = ko

[U2F]
; 带安全密钥的双因素身份验证
; https://developers.yubico.com/U2F/App_ID.html
APP_ID =％（PROTOCOL）s：//％（DOMAIN）s：％（HTTP_PORT）s /
; 逗号分开的未分辨面列表
TRUSTED_FACETS =％（PROTOCOL）s：//％（DOMAIN）s：％（HTTP_PORT）s /

; 扩展映射以突出显示类
; 例如.toml = ini
[highlight.mapping]

[其他]
SHOW_FOOTER_BRANDING = false
; 在页脚中显示有关Gitea和Go的版本信息
SHOW_FOOTER_VERSION = true
; 在页脚中显示模板执行时间
SHOW_FOOTER_TEMPLATE_LOAD_TIME = true

[markup.asciidoc]
ENABLED = false
; 应由外部命令呈现的文件扩展名列表
FILE_EXTENSIONS = .adoc，.asciidoc
; 用于呈现所有匹配扩展的外部命令
RENDER_COMMAND =“asciidoc --out-file =  -   - ”
; 不要在STDIN上传递文件，而是将文件名作为参数传递。
IS_INPUT_FILE = false

[度量]
; 启用指标端点。对或错; 默认为false。
ENABLED = false
; 如果要添加授权，请在此处指定令牌
TOKEN =