如果第一次使用git

首先可以为仓库指定用户名和邮件（这里使用--global指定所有仓库采用该配置）

<u>git config --global user.name "你的用户名"</u>

<u>git config --global user.email "你的邮箱"</u>



对于生成一个版本库（master分支）[确认好工作目录]

<u>git init</u>

此时会生成一个.git的目录，用于跟踪管理版本



**远程仓库**

1.创建SSH Key

ssh-keygen -t rsa –C “邮箱”

再在c/user/E73-8/.ssh中找到

<u>id_rsa私钥（不能泄露）</u>

<u>id_rsa.pub公钥</u>

2.在GitHub的setting的ssh key页面添加ssh key，tiltle合理任意，key填公钥内容

3.在GitHub上创建项目，并根据提示进行克隆或关联

4.git remote add origin https://github.com/*

5.git push -u origin master把本地仓库分支master内容推送到元仓库去

<u>-u参数代表关联，可以简化后续拉取和推送时的命令</u>

以后在提交后直接git push origin master即可

