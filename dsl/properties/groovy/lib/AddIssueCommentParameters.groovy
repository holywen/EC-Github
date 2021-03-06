
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class AddIssueCommentParameters {
    /**
    * Label: Repository Name, type: entry
    */
    String repoName
    /**
    * Label: Issue or PR Num, type: entry
    */
    String issueNum
    /**
    * Label: Comment, type: textarea
    */
    String commentBody

    static AddIssueCommentParameters initParameters(StepParameters sp) {
        AddIssueCommentParameters parameters = new AddIssueCommentParameters()

        def repoName = sp.getRequiredParameter('repoName').value
        parameters.repoName = repoName
        def issueNum = sp.getRequiredParameter('issueNum').value
        parameters.issueNum = issueNum
        def commentBody = sp.getRequiredParameter('commentBody').value
        parameters.commentBody = commentBody

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: f6b63036a72a7f6fabf908ca8176c8eb ===
