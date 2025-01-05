# OOPS
Important OOPS Concepts - Git Commands

D:\2025\programs\OOPS>git init
Initialized empty Git repository in D:/2025/programs/OOPS/.git/

D:\2025\programs\OOPS>git config --global -l
user.name=Gokul-java-developer
user.email=kXXXXXX@gmail.com

D:\2025\programs\OOPS>git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .idea/
        MethodOverloading/
        MethodOverriding/
        MultiThreadingByExtends/
        MultiThreadingByImplements/

nothing added to commit but untracked files present (use "git add" to track)


D:\2025\programs\OOPS>git add .
warning: LF will be replaced by CRLF in .idea/workspace.xml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in MethodOverloading/.gitignore.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in MethodOverloading/src/Main.java.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in MethodOverriding/.gitignore.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in MethodOverriding/src/Main.java.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in MultiThreadingByExtends/.gitignore.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in MultiThreadingByExtends/src/Main.java.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in MultiThreadingByImplements/.gitignore.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in MultiThreadingByImplements/src/Main.java.
The file will have its original line endings in your working directory

D:\2025\programs\OOPS>git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .idea/OOPS.iml
        new file:   .idea/misc.xml
        new file:   .idea/modules.xml
        new file:   .idea/workspace.xml
        new file:   MethodOverloading/.gitignore
        new file:   MethodOverloading/.idea/.gitignore
        new file:   MethodOverloading/.idea/misc.xml
        new file:   MethodOverloading/.idea/modules.xml
        new file:   MethodOverloading/MethodOverloading.iml
        new file:   MethodOverloading/src/Main.java
        new file:   MethodOverloading/src/MethodOverLoad.java
        new file:   MethodOverriding/.gitignore
        new file:   MethodOverriding/.idea/.gitignore
        new file:   MethodOverriding/.idea/misc.xml
        new file:   MethodOverriding/.idea/modules.xml
        new file:   MethodOverriding/MethodOverriding.iml
        new file:   MethodOverriding/src/Child.java
        new file:   MethodOverriding/src/Main.java
        new file:   MethodOverriding/src/Parent.java
        new file:   MultiThreadingByExtends/.gitignore
        new file:   MultiThreadingByExtends/.idea/.gitignore
        new file:   MultiThreadingByExtends/.idea/misc.xml
        new file:   MultiThreadingByExtends/.idea/modules.xml
        new file:   MultiThreadingByExtends/MultiThreadingByExtends.iml
        new file:   MultiThreadingByExtends/src/Main.java
        new file:   MultiThreadingByExtends/src/MultiThread.java
        new file:   MultiThreadingByImplements/.gitignore
        new file:   MultiThreadingByImplements/.idea/.gitignore
        new file:   MultiThreadingByImplements/.idea/misc.xml
        new file:   MultiThreadingByImplements/.idea/modules.xml
        new file:   MultiThreadingByImplements/MultiThreadingByImplements.iml
        new file:   MultiThreadingByImplements/src/Main.java
        new file:   MultiThreadingByImplements/src/MultiThreading.java


D:\2025\programs\OOPS>git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .idea/OOPS.iml
        new file:   .idea/misc.xml
        new file:   .idea/modules.xml
        new file:   .idea/workspace.xml
        new file:   MethodOverloading/.gitignore
        new file:   MethodOverloading/.idea/.gitignore
        new file:   MethodOverloading/.idea/misc.xml
        new file:   MethodOverloading/.idea/modules.xml
        new file:   MethodOverloading/MethodOverloading.iml
        new file:   MethodOverloading/src/Main.java
        new file:   MethodOverloading/src/MethodOverLoad.java
        new file:   MethodOverriding/.gitignore
        new file:   MethodOverriding/.idea/.gitignore
        new file:   MethodOverriding/.idea/misc.xml
        new file:   MethodOverriding/.idea/modules.xml
        new file:   MethodOverriding/MethodOverriding.iml
        new file:   MethodOverriding/src/Child.java
        new file:   MethodOverriding/src/Main.java
        new file:   MethodOverriding/src/Parent.java
        new file:   MultiThreadingByExtends/.gitignore
        new file:   MultiThreadingByExtends/.idea/.gitignore
        new file:   MultiThreadingByExtends/.idea/misc.xml
        new file:   MultiThreadingByExtends/.idea/modules.xml
        new file:   MultiThreadingByExtends/MultiThreadingByExtends.iml
        new file:   MultiThreadingByExtends/src/Main.java
        new file:   MultiThreadingByExtends/src/MultiThread.java
        new file:   MultiThreadingByImplements/.gitignore
        new file:   MultiThreadingByImplements/.idea/.gitignore
        new file:   MultiThreadingByImplements/.idea/misc.xml
        new file:   MultiThreadingByImplements/.idea/modules.xml
        new file:   MultiThreadingByImplements/MultiThreadingByImplements.iml
        new file:   MultiThreadingByImplements/src/Main.java
        new file:   MultiThreadingByImplements/src/MultiThreading.java


D:\2025\programs\OOPS>git commit -m "Method Over-Loading/Riding and MultiThreading"
[master (root-commit) 1fbc62d] Method Over-Loading/Riding and MultiThreading
 33 files changed, 387 insertions(+)
 create mode 100644 .idea/OOPS.iml
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/workspace.xml
 create mode 100644 MethodOverloading/.gitignore
 create mode 100644 MethodOverloading/.idea/.gitignore
 create mode 100644 MethodOverloading/.idea/misc.xml
 create mode 100644 MethodOverloading/.idea/modules.xml
 create mode 100644 MethodOverloading/MethodOverloading.iml
 create mode 100644 MethodOverloading/src/Main.java
 create mode 100644 MethodOverloading/src/MethodOverLoad.java
 create mode 100644 MethodOverriding/.gitignore
 create mode 100644 MethodOverriding/.idea/.gitignore
 create mode 100644 MethodOverriding/.idea/misc.xml
 create mode 100644 MethodOverriding/.idea/modules.xml
 create mode 100644 MethodOverriding/MethodOverriding.iml
 create mode 100644 MethodOverriding/src/Child.java
 create mode 100644 MethodOverriding/src/Main.java
 create mode 100644 MethodOverriding/src/Parent.java
 create mode 100644 MultiThreadingByExtends/.gitignore
 create mode 100644 MultiThreadingByExtends/.idea/.gitignore
 create mode 100644 MultiThreadingByExtends/.idea/misc.xml
 create mode 100644 MultiThreadingByExtends/.idea/modules.xml
 create mode 100644 MultiThreadingByExtends/MultiThreadingByExtends.iml
 create mode 100644 MultiThreadingByExtends/src/Main.java
 create mode 100644 MultiThreadingByExtends/src/MultiThread.java
 create mode 100644 MultiThreadingByImplements/.gitignore
 create mode 100644 MultiThreadingByImplements/.idea/.gitignore
 create mode 100644 MultiThreadingByImplements/.idea/misc.xml
 create mode 100644 MultiThreadingByImplements/.idea/modules.xml
 create mode 100644 MultiThreadingByImplements/MultiThreadingByImplements.iml
 create mode 100644 MultiThreadingByImplements/src/Main.java
 create mode 100644 MultiThreadingByImplements/src/MultiThreading.java

D:\2025\programs\OOPS>git remote add origin git@github.com:Gokul-java-developer/OOPS.git

D:\2025\programs\OOPS>git push origin main
error: src refspec main does not match any
error: failed to push some refs to 'github.com:Gokul-java-developer/OOPS.git'

D:\2025\programs\OOPS>git branch
* master

D:\2025\programs\OOPS>git checkout -b main
Switched to a new branch 'main'

D:\2025\programs\OOPS>git branch
* main
  master

D:\2025\programs\OOPS>git push -u origin main
To github.com:Gokul-java-developer/OOPS.git
 ! [rejected]        main -> main (fetch first)
error: failed to push some refs to 'github.com:Gokul-java-developer/OOPS.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

D:\2025\programs\OOPS>

D:\2025\programs\OOPS>git pull
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (3/3), 879 bytes | 79.00 KiB/s, done.
From github.com:Gokul-java-developer/OOPS
 * [new branch]      main       -> origin/main
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branch> main


D:\2025\programs\OOPS>git push -u origin main
To github.com:Gokul-java-developer/OOPS.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to 'github.com:Gokul-java-developer/OOPS.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

D:\2025\programs\OOPS>git fetch

D:\2025\programs\OOPS>git fetch origin

D:\2025\programs\OOPS>git rebase origin/main
Successfully rebased and updated refs/heads/main.

D:\2025\programs\OOPS>git push --force origin main
Enumerating objects: 36, done.
Counting objects: 100% (36/36), done.
Delta compression using up to 8 threads
Compressing objects: 100% (34/34), done.
Writing objects: 100% (35/35), 4.72 KiB | 967.00 KiB/s, done.
Total 35 (delta 12), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (12/12), done.
To github.com:Gokul-java-developer/OOPS.git
   81a40f5..a8816e9  main -> main

D:\2025\programs\OOPS>
