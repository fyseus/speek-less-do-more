##### fatal: unable to access 'https://github.com/FlyingSF/speek-less-do-more/': OpenSSL SSL_read: Connection was reset, errno 10054

输入`git config --global http.sslVerify "false"`

##### fatal: unable to access 'https://github.com/FlyingSF/speek-less-do-more/': Failed to connect to github.com port 443: Timed out

取消代理

git config --global --unset http.proxy

git config --global --unset https.proxy

或者：

git config --global http.proxy http[s]://userName(encoded):password(encoded)@proxyaddress:port

