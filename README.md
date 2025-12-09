
<--  Steps to push the project in GitHub  -->

🔄 Option 2: Share an Existing Eclipse Project to GitHub

Create or Open a Project in Eclipse

Right-Click on the Project > Team > Share Project Choose Git > Next

Select or create a new repository directory

Click Finish

Commit the Code Right-click the project > Team > Commit
Stage your files (drag to "Staged Changes")

Add a commit message

Click Commit

Push to GitHub Right-click the project > Team > Remote > Push
Enter the GitHub repository URL

Authentication:

Username: GitHub username

Password: Personal access token

Click Next, then select the branch (usually main) > Click Next > Finish

🔐 Notes on GitHub Authentication GitHub has discontinued password authentication. Use a personal access token (PAT):

Generate it at: https://github.com/settings/tokens

Select scopes like repo, workflow, etc. based on your needs

Use this token as the password when Eclipse prompts for GitHub credentials
