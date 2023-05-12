# Git Training

### Link para o curso: [Udemy: Git-Complete](https://www.udemy.com/course/git-complete/)
### Autor: [Jason Taylor](https://compassuol.udemy.com/user/jasontaylor22/)
### P4Merge: [Download](https://download3.fileeagle.com/files/2022/12/p4vinst64.exe)
<br>

## Table of Contents:
1. [Key Concepts](#concepts)
2. [Commands](#commands)  
   1. [Config](#config) 
   2. [Add, Remove and Commit changes](#add-remove-commit)
   3. [Move, delete and Rename files](#mv-del-rn)
   4. [Clenaup](#cleanup)
   5. [Create a repository](#create)
   6. [Logs](#log)
   7. [Diff and Difftools](#diff)
   8. [Tags](#tag)
   9. [Stashing](#stash)
   10. [Branching and Merging](#branching)
   11. [Rebase](#rebase)
   12. [Other commands](#others)
3. [.gitignore](#gitignore)
4. [Config difftool with VSCode](#diff-tool)


## **Key concepts** <a name="concepts"></a>

* Repository: contains all your project files and resources
* Three States of Git
   1. Working Directory -> all files
   2.  Staging Area (a.k.a git  index) -> changes to be commited
   3. Repository (.git folder) -> actual repo, history etc..
* Remote Repository
* Master branch
* Tracked files
   * files that already have been commited or stashed

<br>

## **Commands** <a name="commands"></a>

### Config commands: <a name="config"></a>
---
>**_Note:_** config file in ~/.gitconfig  

`git config --global -e` _opens the config file_

`git config --global --[user.name, user.email]` _set up email and name_

`git config alias.<name> "command"` _create a new git command with the name <name> and command <command>_
* e.g. -> `git config --global alias.hist "log --all --graph --decorate --oneline"` _dont use the inital `git` in the command_

`git config --global --list` _list all configs_

`git config --global init.defaultBranch <name for default branch>` _changes default name of master/main branch_

<br>

### Add, Remove and Commit changes commands: <a name="add-remove-commit"></a>
---

`git add <path-of-changed-file>` _add changes to the stash_

`git add .`  _adds all changes to tracked files in the current directory and its subdirectories to the staging area for the next commit_

`git add -A` _adds all changes to tracked and untracked files in the working tree to the staging area for the next commit_

`git add -U` _adds changes to tracked files and deletions of tracked files to the staging area for the next commit, but does not include untracked files_

`git commit` _use the editor to write a message to the commit_

`git commit -m <message>` _inline message_

`git commit --amend <message>` _to change commit message_

`git commit -am <message>` _to direct add to stash and commit a **tracked file**_

`git restore --staged <file>`

<br>

### Move, Delete and Rename files/dirs commands: <a name="mv-del-rn"></a>
---

`git mv <path> <path>` _move ou rename a file_
>**_Note:_** if you use just mv you have to `git add -A`

>**_Note2:_** if you want to restore a rename just rename again to previous name  

>**_Note3:_** if you renamed something through the explorer its possible that some OS files/dirs are created. Just add the file renamed, dont use git add ., then add again with -u to tell git to update the index 

`git rm <file>` _remove a file. If is an **untracked** file just use rm without git_

>**_Note:_** if you remove a file that is **tracked** without git rm you have to run `git add -A` to add all changes to the stage

`git restore --staged <file>` _follow up with_ `git restore <file>` _to restore a file that has been deleted_

>**_Note:_** the first command just remove the change of the stage, the second restore the file

<br>

### Cleanup and Back to Origin commands: <a name="cleanup"></a>

---

`git pull <repository> <branch>` _updates the current branch with changes from a remote repository_

`git push <repository> <branch>` _sends local changes to a remote repository_

>**_Good Practice:_** Always Pull Before a Push

<br>

### Create Repository Commands: <a name="create"></a>
---

`git clone <link> ` _Create a copy of the **link** repository_

>**_Note:_** if you want to just copy a repo its possibly that you need to [fork](https://docs.github.com/pt/get-started/quickstart/fork-a-repo) before clone 

`git init <project name>` _initiates a repository_

`git init -b <main>` _change the default name for the branch_

`git remote add git@github:<path>` _add the repository to github_

<br>

### Log commands: <a name="log-commands"></a> <a name="log"></a>
---

>**_Note:_** Press Q to quit log

`git log` _shows the commit history of the current branch, including the commit message, author, date, and commit hash_

`git log --abbrev-commit` _shows the commit history with abbreviated commit hashes_

`git log --oneline --graph --decorate` _shows the commit history in a concise and visually appealing way, along with a graphical representation of the branching history_

`git log --since="3 days ago"` _shows the commit history since a certain date, in this case, 3 days ago_

`git log -- <file-name>` _shows the commit history for a specific file_ 

`git show <commit-id>` _displays the details of a specific commit_

`git reflog` _shows a log of all the reference updates in your local repository_

<br>

### Diff commands: <a name="diff"></a>
---

`git diff` _compare changes between different states of the repository_

`git diff <id-commit1> <id-commit1>` _compare changes between two differents commits. Check [log commands](#log-commands)_

`git diff -- <file>` _compare changes between different states of the repository, targeting the file <file>_ 

`git diff HEAD` _compare changes between the working directory and the last commit_ 

`git diff <branch1> <branch2>` _compare changes between the two branches_ 

`git diff --staged HEAD` _compare changes between the staging area and the last commit_ 

>**_Note:_** HEAD stands for the last commit 

`git difftool` _invoke a configured diff tool to visually compare differences between different states of the repository_

>**_Note2:_** You can use difftool with all the diff commands

>**_Note3:_** you may want to configure a difftool, goto [How to configure vscode as the difftool](#diff-tool) section to learn more

<br>

### Tag commands: <a name="tag"></a>
---

>**_Note:_** you can issue `git show <tag-name>` to look for information about the tag 

`git tag <tag-name>` _creates a lw tag_

`git push <repo> <tag-name>` _push tag to remote repository_

`git push <repo> :<tag-name>` _deletes a tag from remote repository_

`git push --tags` _push tags to repository_

`git tag -a <tag-name>` _creates a annotated tag that contains information_

`git tag -a <tag-name> <commit-id>` _creates a annotated tag that contains information for specific commit_

`git tag -a <tag-name> -f <commit-id>` _update tag for specific commit_

`git tag --delete <tag-name>` _deletes the tag_

`git tag --list` _list all tags_

<br>

### Stashing commands: <a name="stash"></a>
---

>**_Note:_** git stash commands will you stash **tracked files**. To stash untracked files use `git stash -u`

`git stash` _stash all current changes_

`git stash save <stash-name>` _stash all current changes in the stash <stash-name>_

`git stash list` _list all stashs_

`git stash show stash@{<stash-index>}` _show changes of the stash_

`git stash apply stash@{<stash-index>}` _unstash changes of stash@{<stash-index>}_

`git stash drop stash@{<stash-index>}` _drop changes of stash@{<stash-index>}_

>**_Note2:_** use list command to get the index 

`git stash apply` _unstash all stashed changes_

`git stash drop` _use to drop the stash. Use after apply_

`git stash pop` _short version of apply and drop stash_

`git stash clear` _drop all stashes
_

`git stash branch <branch-name>` _creates a new branch <branch-name> with all current changes_

<br>

### Branching and Merge commands: <a name="branching"></a>
---

`git branch` _list local branches_

`git branch -a` _list all existing branches (remote and local)_

`git branch -m <new-name>` _change the name of the branch_

`git branch -m <old-name> <new-name>` _rename branch <old-name>_

`git branch -m <new-name>` _change the name of the branch_

`git branch -d <branch-name>` _deletes branch <branch-name>_

`git branch <branch-name>` _creates a new branch <branch-name>_

`git checkout <branch-name>` _swtich to branch <branch-name>_

`git checkout -b <branch-name>` _create and swtich to branch <branch-name>_

`git merge <branch>` _merges current branch with <branch>_

>**_Note:_** Git performs [fast-forward](https://blog.mergify.com/what-is-a-git-merge-fast-forward/#:~:text=Fast%2Dforward%20merges%20literally%20move,back%20into%20your%20main%20branch.) merge when possible. To ensure that a new branch commit is created use --no-ff 

`git fetch` _retrieves the latest commits and changes from a remote repository, allowing you to update your local repository with the most recent state of the remote repository_

`git reset HEAD^1` _undoes the most recent commit_

`git reset <commit-id>` _goes back to the commit <commit-id>_

`git cherry-pick <commit-id>` _choose specific commits to apply in the current branch_

<br>

### Rebase commands: <a name="rebase"></a>
--- 

`git rebase <source-branch>` _apply changes of branch <source-branch> in the current branch_

`git rebase --abort` _aborts the rebase_

`git rebase --continue` _after resolving conflicts_

>**_Note:_** Rebase when you want to incorporate the master changes in your current branch

`git pull --rebase <branch1> <branch2>` _you can pull changes of a remote repository to local while keeping your local commits on top_

<br>

### Other commands: <a name="others"></a>
---

`git status` _To see changes on working dir, staging area, repo..._

`git ls-files` _list **tracked files**_

<br>

## .gitignore file: <a name="gitignore"></a>

In a .gitignore file, you can use several types of patterns to specify which files and directories to ignore. Here are some examples:

>**_Note:_** You have to commit the .gitignore file!

* Specifc File: MyFile.ext
* File Pattern: *.ext _to ignore all .ext files. [Click here](https://git-scm.com/book/en/v2/Git-Basics-Recording-Changes-to-the-Repository#_ignoring) to learn more about patterns_
* Folder: my-folder/

<br>

## How to configure vscode as the difftool: <a name="diff-tool"></a>

1. Go to the gitconfig file in ~/.gitconfig or use the command `git config --global -e`

2. Type the following configuration:
```
   [core]
      editor = code --wait
   [diff]
      tool = vscode
   [difftool "vscode"]
      cmd = code --wait --diff $LOCAL $REMOTE
   [merge]
      tool = vscode
   [mergetool "vscode"]
      cmd = code --wait $MERGED
```