=======================================================
======= Steps to create or use a git repository =======
=======================================================

1. Create a new repository on the command line:

echo "# Test_test_2" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin <repository_link>.git
git push -u origin main

2. Push an existing repository from the command line:

git remote add origin <repository_link>.git
git branch -M main
git push -u origin main

=======================================================