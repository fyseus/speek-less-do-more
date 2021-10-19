##### 1.代码备份，分支管理

##### 2.多人协同开发

首先，可以试图用git push origin branch-name推送自己的修改.
如果推送失败，则因为远程分支比你的本地更新早，需要先用git pull试图合并。
如果合并有冲突，则需要解决冲突，并在本地提交。再用git push origin branch-name推送。

##### 3.分布式版本控制系统

区别于SVN集中式版本控制系统，无中央服务器，每人有各自的版本库，修改完互相推送，借助分支，并合理规划合并方式

##### 4.版本管理系统只能跟踪文本文件的改动

##### 5.**理解工作区与暂存区的区别**

工作区：即工作目录中除.git的文件和目录

版本库：.git目录，其中有暂存区stage，还有第一个分支master，以及master的指针HEAD

##### 6.分支策略

主分支应该非常稳定，用来发布新版本，一般情况下不允许在上面干活，干活一般情况下在新建的dev分支，干完后，比如要发布或dev稳定后，才也可以合并到主分支上来

##### 7.Github flow

第一步：根据需求，从`master`拉出新分支，不区分功能分支或补丁分支。

第二步：新分支开发完成后，或者需要讨论的时候，就向`master`发起一个[pull request](https://help.github.com/articles/using-pull-requests/)（简称PR）。

第三步：Pull Request既是一个通知，让别人注意到你的请求，又是一种对话机制，大家一起评审和讨论你的代码。对话过程中，你还可以不断提交代码。

第四步：你的Pull Request被接受，合并进`master`，重新部署后，原来你拉出来的那个分支就被删除。（先部署再合并也可。）

功能分支合并进`master`分支，必须通过Pull Request（Gitlab里面叫做 Merge Request）。

前面说过，Pull Request本质是一种对话机制，你可以在提交的时候，`@`相关[人员](https://github.com/blog/1004-mention-autocompletion)或[团队](https://github.com/blog/1121-introducing-team-mentions)，引起他们的注意。

##### 8.Github Issue

Issue 用于 Bug追踪和需求管理。建议先新建 Issue，再新建对应的功能分支。功能分支总是为了解决一个或多个 Issue。

功能分支的名称，可以与issue的名字保持一致，并且以issue的编号起首，比如"15-require-a-password-to-change-it"。

开发完成后，在提交说明里面，可以写上"fixes #14"或者"closes #67"。Github规定，只要commit message里面有下面这些[动词](https://help.github.com/articles/closing-issues-via-commit-messages/) + 编号，就会关闭对应的issue。

> - close
> - closes
> - closed
> - fix
> - fixes
> - fixed
> - resolve
> - resolves
> - resolved

Pull Request被接受以后，issue关闭，原始分支就应该删除。如果以后该issue重新打开，新分支可以复用原来的名字。

##### 9.Merge节点

Git有两种合并：一种是"直进式合并"（fast forward），不生成单独的合并节点；另一种是"非直进式合并"（none fast-forword），会生成单独节点。

前者不利于保持commit信息的清晰，也不利于以后的回滚，建议总是采用后者（即使用`--no-ff`参数）。只要发生合并，就要有一个单独的合并节点。

##### 10.Squash 多个commit

为了便于他人阅读你的提交，也便于`cherry-pick`或撤销代码变化，在发起Pull Request之前，应该把多个commit合并成一个。（前提是，该分支只有你一个人开发，且没有跟`master`合并过。）

这可以采用`rebase`命令附带的`squash`操作
