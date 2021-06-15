Push an existing folder
cd existing_folder
git init
git remote add origin git@gitlab.com:vanshika__/dekstopfolder-application.git
git add .
git commit -m "Initial commit"
git push -u origin main


Create a new repository
git clone git@gitlab.com:vanshika__/dekstopfolder-application.git
cd dekstopfolder-application
touch README.md
git add README.md
git commit -m "add README"
git push -u origin main

git remote add origin git@gitlab.com:vanshika__/java-dekstop-application.git