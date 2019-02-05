; This file lists the default values used by Gitea
; Copy required sections to your own app.ini (default is custom/conf/app.ini)
; and modify as needed.

; see https://docs.gitea.io/en-us/config-cheat-sheet/ for additional documentation.

; App name that shows in every page title
APP_NAME = Gitea: Git with a cup of tea
; Change it if you run locally
RUN_USER = git
; Either "dev", "prod" or "test", default is "dev"
RUN_MODE = dev

[repository]
ROOT =
SCRIPT_TYPE = bash
; Default ANSI charset
ANSI_CHARSET =
; Force every new repository to be private
FORCE_PRIVATE = false
; Default privacy setting when creating a new repository, allowed values: last, private, public. Default is last which means the last setting used.
DEFAULT_PRIVATE = last
; Global limit of repositories per user, applied at creation time. -1 means no limit
MAX_CREATION_LIMIT = -1
; Mirror sync queue length, increase if mirror syncing starts hanging
MIRROR_QUEUE_LENGTH = 1000
; Patch test queue length, increase if pull request patch testing starts hanging
PULL_REQUEST_QUEUE_LENGTH = 1000
; Preferred Licenses to place at the top of the List
; The name here must match the filename in conf/license or custom/conf/license
PREFERRED_LICENSES = Apache License 2.0,MIT License
; Disable the ability to interact with repositories using the HTTP protocol
DISABLE_HTTP_GIT = false
; Value for Access-Control-Allow-Origin header, default is not to present
; WARNING: This maybe harmful to you website if you do not give it a right value.
ACCESS_CONTROL_ALLOW_ORIGIN = 
; Force ssh:// clone url instead of scp-style uri when default SSH port is used
USE_COMPAT_SSH_URI = false

[repository.editor]
; List of file extensions for which lines should be wrapped in the CodeMirror editor
; Separate extensions with a comma. To line wrap files without an extension, just put a comma
LINE_WRAP_EXTENSIONS = .txt,.md,.markdown,.mdown,.mkd,
; Valid file modes that have a preview API associated with them, such as api/v1/markdown
; Separate the values by commas. The preview tab in edit mode won't be displayed if the file extension doesn't match
PREVIEWABLE_FILE_MODES = markdown

[repository.local]
; Path for local repository copy. Defaults to `tmp/local-repo`
LOCAL_COPY_PATH = tmp/local-repo
; Path for local wiki copy. Defaults to `tmp/local-wiki`
LOCAL_WIKI_PATH = tmp/local-wiki

[repository.upload]
; Whether repository file uploads are enabled. Defaults to `true`
ENABLED = true
; Path for uploads. Defaults to `data/tmp/uploads` (tmp gets deleted on gitea restart)
TEMP_PATH = data/tmp/uploads
; One or more allowed types, e.g. image/jpeg|image/png. Nothing means any file type
ALLOWED_TYPES =
; Max size of each file in megabytes. Defaults to 3MB
FILE_MAX_SIZE = 3
; Max number of files per upload. Defaults to 5
MAX_FILES = 5

[repository.pull-request]
; List of prefixes used in Pull Request title to mark them as Work In Progress
WORK_IN_PROGRESS_PREFIXES=WIP:,[WIP]

[ui]
; Number of repositories that are displayed on one explore page
EXPLORE_PAGING_NUM = 20
; Number of issues that are displayed on one page
ISSUE_PAGING_NUM = 10
; Number of maximum commits displayed in one activity feed
FEED_MAX_COMMIT_NUM = 5
; Number of maximum commits displayed in commit graph.
GRAPH_MAX_COMMIT_NUM = 100
; Number of line of codes shown for a code comment
CODE_COMMENT_LINES = 4
; Value of `theme-color` meta tag, used by Android >= 5.0
; An invalid color like "none" or "disable" will have the default style
; More info: https://developers.google.com/web/updates/2014/11/Support-for-theme-color-in-Chrome-39-for-Android
THEME_COLOR_META_TAG = `#6cc644`
; Max size of files to be displayed (default is 8MiB)
MAX_DISPLAY_FILE_SIZE = 8388608
; Whether the email of the user should be shown in the Explore Users page
SHOW_USER_EMAIL = true
; Set the default theme for the Gitea install
DEFAULT_THEME = gitea
; All available themes. Allow users select personalized themes regardless of the value of `DEFAULT_THEME`.
THEMES = gitea,arc-green

[ui.admin]
; Number of users that are displayed on one page
USER_PAGING_NUM = 50
; Number of repos that are displayed on one page
REPO_PAGING_NUM = 50
; Number of notices that are displayed on one page
NOTICE_PAGING_NUM = 25
; Number of organizations that are displayed on one page
ORG_PAGING_NUM = 50

[ui.user]
; Number of repos that are displayed on one page
REPO_PAGING_NUM = 15

[ui.meta]
AUTHOR = Gitea - Git with a cup of tea
DESCRIPTION = Gitea (Git with a cup of tea) is a painless self-hosted Git service written in Go
KEYWORDS = go,git,self-hosted,gitea

[markdown]
; Enable hard line break extension
ENABLE_HARD_LINE_BREAK = false
; List of custom URL-Schemes that are allowed as links when rendering Markdown
; for example git,magnet
CUSTOM_URL_SCHEMES =
; List of file extensions that should be rendered/edited as Markdown
; Separate the extensions with a comma. To render files without any extension as markdown, just put a comma
FILE_EXTENSIONS = .md,.markdown,.mdown,.mkd

[server]
; The protocol the server listens on. One of 'http', 'https', 'unix' or 'fcgi'.
PROTOCOL = http
DOMAIN = localhost
ROOT_URL = %(PROTOCOL)s://%(DOMAIN)s:%(HTTP_PORT)s/
; The address to listen on. Either a IPv4/IPv6 address or the path to a unix socket.
HTTP_ADDR = 0.0.0.0
HTTP_PORT = 3000
; If REDIRECT_OTHER_PORT is true, and PROTOCOL is set to https an http server
; will be started on PORT_TO_REDIRECT and it will redirect plain, non-secure http requests to the main
; ROOT_URL.  Defaults are false for REDIRECT_OTHER_PORT and 80 for
; PORT_TO_REDIRECT.
REDIRECT_OTHER_PORT = false
PORT_TO_REDIRECT = 80
; Permission for unix socket
UNIX_SOCKET_PERMISSION = 666
; Local (DMZ) URL for Gitea workers (such as SSH update) accessing web service.
; In most cases you do not need to change the default value.
; Alter it only if your SSH server node is not the same as HTTP node.
; Do not set this variable if PROTOCOL is set to 'unix'.
LOCAL_ROOT_URL = %(PROTOCOL)s://%(HTTP_ADDR)s:%(HTTP_PORT)s/
; Disable SSH feature when not available
DISABLE_SSH = false
; Whether to use the builtin SSH server or not.
START_SSH_SERVER = false
; Username to use for the builtin SSH server. If blank, then it is the value of RUN_USER.
BUILTIN_SSH_SERVER_USER =
; Domain name to be exposed in clone URL
SSH_DOMAIN = %(DOMAIN)s
; The network interface the builtin SSH server should listen on
SSH_LISTEN_HOST =
; Port number to be exposed in clone URL
SSH_PORT = 22
; The port number the builtin SSH server should listen on
SSH_LISTEN_PORT = %(SSH_PORT)s
; Root path of SSH directory, default is '~/.ssh', but you have to use '/home/git/.ssh'.
SSH_ROOT_PATH =
; Gitea will create a authorized_keys file by default when it is not using the internal ssh server
; If you intend to use the AuthorizedKeysCommand functionality then you should turn this off.
SSH_CREATE_AUTHORIZED_KEYS_FILE = true
; For the built-in SSH server, choose the ciphers to support for SSH connections,
; for system SSH this setting has no effect
SSH_SERVER_CIPHERS = aes128-ctr, aes192-ctr, aes256-ctr, aes128-gcm@openssh.com, arcfour256, arcfour128
; For the built-in SSH server, choose the key exchange algorithms to support for SSH connections,
; for system SSH this setting has no effect
SSH_SERVER_KEY_EXCHANGES = diffie-hellman-group1-sha1, diffie-hellman-group14-sha1, ecdh-sha2-nistp256, ecdh-sha2-nistp384, ecdh-sha2-nistp521, curve25519-sha256@libssh.org
; For the built-in SSH server, choose the MACs to support for SSH connections,
; for system SSH this setting has no effect
SSH_SERVER_MACS = hmac-sha2-256-etm@openssh.com, hmac-sha2-256, hmac-sha1, hmac-sha1-96
; Directory to create temporary files in when testing public keys using ssh-keygen,
; default is the system temporary directory.
SSH_KEY_TEST_PATH =
; Path to ssh-keygen, default is 'ssh-keygen' which means the shell is responsible for finding out which one to call.
SSH_KEYGEN_PATH = ssh-keygen
; Enable SSH Authorized Key Backup when rewriting all keys, default is true
SSH_BACKUP_AUTHORIZED_KEYS = true
; Enable exposure of SSH clone URL to anonymous visitors, default is false
SSH_EXPOSE_ANONYMOUS = false
; Indicate whether to check minimum key size with corresponding type
MINIMUM_KEY_SIZE_CHECK = false
; Disable CDN even in "prod" mode
OFFLINE_MODE = false
DISABLE_ROUTER_LOG = false
; Generate steps:
; $ ./gitea cert -ca=true -duration=8760h0m0s -host=myhost.example.com
;
; Or from a .pfx file exported from the Windows certificate store (do
; not forget to export the private key):
; $ openssl pkcs12 -in cert.pfx -out cert.pem -nokeys
; $ openssl pkcs12 -in cert.pfx -out key.pem -nocerts -nodes
CERT_FILE = custom/https/cert.pem
KEY_FILE = custom/https/key.pem
; Root directory containing templates and static files.
; default is the path where Gitea is executed
STATIC_ROOT_PATH =
; Default path for App data
APP_DATA_PATH = data
; Application level GZIP support
ENABLE_GZIP = false
; Application profiling (memory and cpu)
; For "web" command it listens on localhost:6060
; For "serve" command it dumps to disk at PPROF_DATA_PATH as (cpuprofile|memprofile)_<username>_<temporary id>
ENABLE_PPROF = false
; PPROF_DATA_PATH, use an absolute path when you start gitea as service
PPROF_DATA_PATH = data/tmp/pprof
; Landing page, can be "home", "explore", or "organizations"
LANDING_PAGE = home
; Enables git-lfs support. true or false, default is false.
LFS_START_SERVER = false
; Where your lfs files reside, default is data/lfs.
LFS_CONTENT_PATH = data/lfs
; LFS authentication secret, change this yourself
LFS_JWT_SECRET =
; LFS authentication validity period (in time.Duration), pushes taking longer than this may fail.
LFS_HTTP_AUTH_EXPIRY = 20m

; Define allowed algorithms and their minimum key length (use -1 to disable a type)
[ssh.minimum_key_sizes]
ED25519 = 256
ECDSA = 256
RSA = 2048
DSA = 1024

[database]
; Either "mysql", "postgres", "mssql" or "sqlite3", it's your choice
DB_TYPE = mysql
HOST = 127.0.0.1:3306
NAME = gitea
USER = root
; Use PASSWD = `your password` for quoting if you use special characters in the password.
PASSWD =
; For Postgres, either "disable" (default), "require", or "verify-full"
; For MySQL, either "false" (default), "true", or "skip-verify"
SSL_MODE = disable
; For "sqlite3" and "tidb", use an absolute path when you start gitea as service
PATH = data/gitea.db
; For "sqlite3" only. Query timeout
SQLITE_TIMEOUT = 500
; For iterate buffer, default is 50
ITERATE_BUFFER_SIZE = 50
; Show the database generated SQL
LOG_SQL = true
; Maximum number of DB Connect retries
DB_RETRIES = 10
; Backoff time per DB retry (time.Duration)
DB_RETRY_BACKOFF = 3s


[indexer]
ISSUE_INDEXER_PATH = indexers/issues.bleve
; repo indexer by default disabled, since it uses a lot of disk space
REPO_INDEXER_ENABLED = false
REPO_INDEXER_PATH = indexers/repos.bleve
UPDATE_BUFFER_LEN = 20
MAX_FILE_SIZE = 1048576

[admin]
; Disallow regular (non-admin) users from creating organizations.
DISABLE_REGULAR_ORG_CREATION = false

[security]
; Whether the installer is disabled
INSTALL_LOCK = false
; !!CHANGE THIS TO KEEP YOUR USER DATA SAFE!!
SECRET_KEY = !#@FDEWREWR&*(
; How long to remember that an user is logged in before requiring relogin (in days)
LOGIN_REMEMBER_DAYS = 7
COOKIE_USERNAME = gitea_awesome
COOKIE_REMEMBER_NAME = gitea_incredible
; Reverse proxy authentication header name of user name
REVERSE_PROXY_AUTHENTICATION_USER = X-WEBAUTH-USER
REVERSE_PROXY_AUTHENTICATION_EMAIL = X-WEBAUTH-EMAIL
; The minimum password length for new Users
MIN_PASSWORD_LENGTH = 6
; Set to true to allow users to import local server paths
IMPORT_LOCAL_PATHS = false
; Set to true to prevent all users (including admin) from creating custom git hooks
DISABLE_GIT_HOOKS = false

[openid]
;
; OpenID is an open, standard and decentralized authentication protocol.
; Your identity is the address of a webpage you provide, which describes
; how to prove you are in control of that page.
;
; For more info: https://en.wikipedia.org/wiki/OpenID
;
; Current implementation supports OpenID-2.0
;
; Tested to work providers at the time of writing:
;  - Any GNUSocial node (your.hostname.tld/username)
;  - Any SimpleID provider (http://simpleid.koinic.net)
;  - http://openid.org.cn/
;  - openid.stackexchange.com
;  - login.launchpad.net
;  - <username>.livejournal.com
;
; Whether to allow signin in via OpenID
ENABLE_OPENID_SIGNIN = true
; Whether to allow registering via OpenID
; Do not include to rely on rhw DISABLE_REGISTRATION setting
;ENABLE_OPENID_SIGNUP = true
; Allowed URI patterns (POSIX regexp).
; Space separated.
; Only these would be allowed if non-blank.
; Example value: trusted.domain.org trusted.domain.net
WHITELISTED_URIS =
; Forbidden URI patterns (POSIX regexp).
; Space separated.
; Only used if WHITELISTED_URIS is blank.
; Example value: loadaverage.org/badguy stackexchange.com/.*spammer
BLACKLISTED_URIS =

[service]
; Time limit to confirm account/email registration
ACTIVE_CODE_LIVE_MINUTES = 180
; Time limit to perform the reset of a forgotten password
RESET_PASSWD_CODE_LIVE_MINUTES = 180
; Whether a new user needs to confirm their email when registering.
REGISTER_EMAIL_CONFIRM = false
; List of domain names that are allowed to be used to register on a Gitea instance
; gitea.io,example.com
EMAIL_DOMAIN_WHITELIST=
; Disallow registration, only allow admins to create accounts.
DISABLE_REGISTRATION = false
; Allow registration only using third-party services, it works only when DISABLE_REGISTRATION is false
ALLOW_ONLY_EXTERNAL_REGISTRATION = false
; User must sign in to view anything.
REQUIRE_SIGNIN_VIEW = false
; Mail notification
ENABLE_NOTIFY_MAIL = false
; More detail: https://github.com/gogits/gogs/issues/165
ENABLE_REVERSE_PROXY_AUTHENTICATION = false
ENABLE_REVERSE_PROXY_AUTO_REGISTRATION = false
ENABLE_REVERSE_PROXY_EMAIL = false
; Enable captcha validation for registration
ENABLE_CAPTCHA = false
; Type of captcha you want to use. Options: image, recaptcha
CAPTCHA_TYPE = image
; Enable recaptcha to use Google's recaptcha service
; Go to https://www.google.com/recaptcha/admin to sign up for a key
RECAPTCHA_SECRET  =
RECAPTCHA_SITEKEY =
; Default value for KeepEmailPrivate
; Each new user will get the value of this setting copied into their profile
DEFAULT_KEEP_EMAIL_PRIVATE = false
; Default value for AllowCreateOrganization
; Every new user will have rights set to create organizations depending on this setting
DEFAULT_ALLOW_CREATE_ORGANIZATION = true
; Default value for EnableDependencies
; Repositories will use dependencies by default depending on this setting
DEFAULT_ENABLE_DEPENDENCIES = true
; Enable heatmap on users profiles.
ENABLE_USER_HEATMAP = true
; Enable Timetracking
ENABLE_TIMETRACKING = true
; Default value for EnableTimetracking
; Repositories will use timetracking by default depending on this setting
DEFAULT_ENABLE_TIMETRACKING = true
; Default value for AllowOnlyContributorsToTrackTime
; Only users with write permissions can track time if this is true
DEFAULT_ALLOW_ONLY_CONTRIBUTORS_TO_TRACK_TIME = true
; Default value for the domain part of the user's email address in the git log
; if he has set KeepEmailPrivate to true. The user's email will be replaced with a
; concatenation of the user name in lower case, "@" and NO_REPLY_ADDRESS.
NO_REPLY_ADDRESS = noreply.example.org
; Show Registration button
SHOW_REGISTRATION_BUTTON = true
; Default value for AutoWatchNewRepos
; When adding a repo to a team or creating a new repo all team members will watch the 
; repo automatically if enabled 
AUTO_WATCH_NEW_REPOS = true

[webhook]
; Hook task queue length, increase if webhook shooting starts hanging
QUEUE_LENGTH = 1000
; Deliver timeout in seconds
DELIVER_TIMEOUT = 5
; Allow insecure certification
SKIP_TLS_VERIFY = false
; Number of history information in each page
PAGING_NUM = 10

[mailer]
ENABLED = false
; Buffer length of channel, keep it as it is if you don't know what it is.
SEND_BUFFER_LEN = 100
; Name displayed in mail title
SUBJECT = %(APP_NAME)s
; Mail server
; Gmail: smtp.gmail.com:587
; QQ: smtp.qq.com:465
; Note, if the port ends with "465", SMTPS will be used. Using STARTTLS on port 587 is recommended per RFC 6409. If the server supports STARTTLS it will always be used.
HOST =
; Disable HELO operation when hostnames are different.
DISABLE_HELO =
; Custom hostname for HELO operation, if no value is provided, one is retrieved from system.
HELO_HOSTNAME =
; Do not verify the certificate of the server. Only use this for self-signed certificates
SKIP_VERIFY =
; Use client certificate
USE_CERTIFICATE = false
CERT_FILE = custom/mailer/cert.pem
KEY_FILE = custom/mailer/key.pem
; Should SMTP connection use TLS
IS_TLS_ENABLED = false
; Mail from address, RFC 5322. This can be just an email address, or the `"Name" <email@example.com>` format
FROM =
; Mailer user name and password
USER =
; Use PASSWD = `your password` for quoting if you use special characters in the password.
PASSWD =
; Send mails as plain text
SEND_AS_PLAIN_TEXT = false
; Set Mailer Type (either SMTP, sendmail or dummy to just send to the log)
MAILER_TYPE = smtp
; Specify an alternative sendmail binary
SENDMAIL_PATH = sendmail
; Specify any extra sendmail arguments
SENDMAIL_ARGS =

[cache]
; Either "memory", "redis", or "memcache", default is "memory"
ADAPTER = memory
; For "memory" only, GC interval in seconds, default is 60
INTERVAL = 60
; For "redis" and "memcache", connection host address
; redis: network=tcp,addr=:6379,password=macaron,db=0,pool_size=100,idle_timeout=180
; memcache: `127.0.0.1:11211`
HOST =
; Time to keep items in cache if not used, default is 16 hours.
; Setting it to 0 disables caching
ITEM_TTL = 16h

[session]
; Either "memory", "file", or "redis", default is "memory"
PROVIDER = memory
; Provider config options
; memory: doesn't have any config yet
; file: session file path, e.g. `data/sessions`
; redis: network=tcp,addr=:6379,password=macaron,db=0,pool_size=100,idle_timeout=180
; mysql: go-sql-driver/mysql dsn config string, e.g. `root:password@/session_table`
PROVIDER_CONFIG = data/sessions
; Session cookie name
COOKIE_NAME = i_like_gitea
; If you use session in https only, default is false
COOKIE_SECURE = false
; Enable set cookie, default is true
ENABLE_SET_COOKIE = true
; Session GC time interval in seconds, default is 86400 (1 day)
GC_INTERVAL_TIME = 86400
; Session life time in seconds, default is 86400 (1 day)
SESSION_LIFE_TIME = 86400

[picture]
AVATAR_UPLOAD_PATH = data/avatars
; Max Width and Height of uploaded avatars. This is to limit the amount of RAM
; used when resizing the image.
AVATAR_MAX_WIDTH = 4096
AVATAR_MAX_HEIGHT = 3072
; Chinese users can choose "duoshuo"
; or a custom avatar source, like: http://cn.gravatar.com/avatar/
GRAVATAR_SOURCE = gravatar
; This value will always be true in offline mode.
DISABLE_GRAVATAR = false
; Federated avatar lookup uses DNS to discover avatar associated
; with emails, see https://www.libravatar.org
; This value will always be false in offline mode or when Gravatar is disabled.
ENABLE_FEDERATED_AVATAR = false

[attachment]
; Whether attachments are enabled. Defaults to `true`
ENABLED = true
; Path for attachments. Defaults to `data/attachments`
PATH = data/attachments
; One or more allowed types, e.g. image/jpeg|image/png
ALLOWED_TYPES = image/jpeg|image/png|application/zip|application/gzip
; Max size of each file. Defaults to 4MB
MAX_SIZE = 4
; Max number of files per upload. Defaults to 5
MAX_FILES = 5

[time]
; Specifies the format for fully outputted dates. Defaults to RFC1123
; Special supported values are ANSIC, UnixDate, RubyDate, RFC822, RFC822Z, RFC850, RFC1123, RFC1123Z, RFC3339, RFC3339Nano, Kitchen, Stamp, StampMilli, StampMicro and StampNano
; For more information about the format see http://golang.org/pkg/time/#pkg-constants
FORMAT =

[log]
ROOT_PATH =
; Either "console", "file", "conn", "smtp" or "database", default is "console"
; Use comma to separate multiple modes, e.g. "console, file"
MODE = console
; Buffer length of the channel, keep it as it is if you don't know what it is.
BUFFER_LEN = 10000
; Either "Trace", "Debug", "Info", "Warn", "Error", "Critical", default is "Trace"
LEVEL = Trace

; For "console" mode only
[log.console]
LEVEL =

; For "file" mode only
[log.file]
LEVEL =
; This enables automated log rotate(switch of following options), default is true
LOG_ROTATE = true
; Max number of lines in a single file, default is 1000000
MAX_LINES = 1000000
; Max size shift of a single file, default is 28 means 1 << 28, 256MB
MAX_SIZE_SHIFT = 28
; Segment log daily, default is true
DAILY_ROTATE = true
; delete the log file after n days, default is 7
MAX_DAYS = 7

; For "conn" mode only
[log.conn]
LEVEL =
; Reconnect host for every single message, default is false
RECONNECT_ON_MSG = false
; Try to reconnect when connection is lost, default is false
RECONNECT = false
; Either "tcp", "unix" or "udp", default is "tcp"
PROTOCOL = tcp
; Host address
ADDR =

; For "smtp" mode only
[log.smtp]
LEVEL =
; Name displayed in mail title, default is "Diagnostic message from server"
SUBJECT = Diagnostic message from server
; Mail server
HOST =
; Mailer user name and password
USER =
; Use PASSWD = `your password` for quoting if you use special characters in the password.
PASSWD =
; Receivers, can be one or more, e.g. 1@example.com,2@example.com
RECEIVERS =

; For "database" mode only
[log.database]
LEVEL =
; Either "mysql" or "postgres"
DRIVER =
; Based on xorm, e.g.: root:root@localhost/gitea?charset=utf8
CONN =

[cron]
; Enable running cron tasks periodically.
ENABLED = true
; Run cron tasks when Gitea starts.
RUN_AT_START = false

; Update mirrors
[cron.update_mirrors]
SCHEDULE = @every 10m

; Repository health check
[cron.repo_health_check]
SCHEDULE = @every 24h
TIMEOUT = 60s
; Arguments for command 'git fsck', e.g. "--unreachable --tags"
; see more on http://git-scm.com/docs/git-fsck
ARGS =

; Check repository statistics
[cron.check_repo_stats]
RUN_AT_START = true
SCHEDULE = @every 24h

; Clean up old repository archives
[cron.archive_cleanup]
; Whether to enable the job
ENABLED = true
; Whether to always run at least once at start up time (if ENABLED)
RUN_AT_START = true
; Time interval for job to run
SCHEDULE = @every 24h
; Archives created more than OLDER_THAN ago are subject to deletion
OLDER_THAN = 24h

; Synchronize external user data (only LDAP user synchronization is supported)
[cron.sync_external_users]
; Synchronize external user data when starting server (default false)
RUN_AT_START = false
; Interval as a duration between each synchronization (default every 24h)
SCHEDULE = @every 24h
; Create new users, update existing user data and disable users that are not in external source anymore (default)
;   or only create new users if UPDATE_EXISTING is set to false
UPDATE_EXISTING = true

[git]
; Disables highlight of added and removed changes
DISABLE_DIFF_HIGHLIGHT = false
; Max number of lines allowed in a single file in diff view
MAX_GIT_DIFF_LINES = 1000
; Max number of allowed characters in a line in diff view
MAX_GIT_DIFF_LINE_CHARACTERS = 5000
; Max number of files shown in diff view
MAX_GIT_DIFF_FILES = 100
; Arguments for command 'git gc', e.g. "--aggressive --auto"
; see more on http://git-scm.com/docs/git-gc/
GC_ARGS =

; Operation timeout in seconds
[git.timeout]
MIGRATE = 600
MIRROR = 300
CLONE = 300
PULL = 300
GC = 60

[mirror]
; Default interval as a duration between each check
DEFAULT_INTERVAL = 8h
; Min interval as a duration must be > 1m
MIN_INTERVAL = 10m

[api]
; Enables Swagger. True or false; default is true.
ENABLE_SWAGGER = true
; Max number of items in a page
MAX_RESPONSE_ITEMS = 50
; Default paging number of api
DEFAULT_PAGING_NUM = 30

[i18n]
LANGS = en-US,zh-CN,zh-HK,zh-TW,de-DE,fr-FR,nl-NL,lv-LV,ru-RU,uk-UA,ja-JP,es-ES,pt-BR,pl-PL,bg-BG,it-IT,fi-FI,tr-TR,cs-CZ,sr-SP,sv-SE,ko-KR
NAMES = English,简体中文,繁體中文（香港）,繁體中文（台灣）,Deutsch,français,Nederlands,latviešu,русский,Українська,日本語,español,português do Brasil,polski,български,italiano,suomi,Türkçe,čeština,српски,svenska,한국어

; Used for datetimepicker
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
uk-UA = uk
ja-JP = ja
es-ES = es
pt-BR = pt-BR
pl-PL = pl
bg-BG = bg
it-IT = it
fi-FI = fi
tr-TR = tr
cs-CZ = cs-CZ
sr-SP = sr
sv-SE = sv
ko-KR = ko

[U2F]
; Two Factor authentication with security keys
; https://developers.yubico.com/U2F/App_ID.html
APP_ID = %(PROTOCOL)s://%(DOMAIN)s:%(HTTP_PORT)s/
; Comma seperated list of truisted facets
TRUSTED_FACETS = %(PROTOCOL)s://%(DOMAIN)s:%(HTTP_PORT)s/

; Extension mapping to highlight class
; e.g. .toml=ini
[highlight.mapping]

[other]
SHOW_FOOTER_BRANDING = false
; Show version information about Gitea and Go in the footer
SHOW_FOOTER_VERSION = true
; Show template execution time in the footer
SHOW_FOOTER_TEMPLATE_LOAD_TIME = true

[markup.asciidoc]
ENABLED = false
; List of file extensions that should be rendered by an external command
FILE_EXTENSIONS = .adoc,.asciidoc
; External command to render all matching extensions
RENDER_COMMAND = "asciidoc --out-file=- -"
; Don't pass the file on STDIN, pass the filename as argument instead.
IS_INPUT_FILE = false

[metrics]
; Enables metrics endpoint. True or false; default is false.
ENABLED = false
; If you want to add authorization, specify a token here
TOKEN =