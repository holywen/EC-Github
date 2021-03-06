
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class SetCommitStatusParameters {
    /**
    * Label: Repository Name, type: entry
    */
    String repoName
    /**
    * Label: Commit SHA, type: entry
    */
    String sha
    /**
    * Label: State, type: select
    */
    String state
    /**
    * Label: Target URL, type: entry
    */
    String targetUrl
    /**
    * Label: Mimic Runtime Status, type: select
    */
    String mimic
    /**
    * Label: Description, type: textarea
    */
    String description

    static SetCommitStatusParameters initParameters(StepParameters sp) {
        SetCommitStatusParameters parameters = new SetCommitStatusParameters()

        def repoName = sp.getRequiredParameter('repoName').value
        parameters.repoName = repoName
        def sha = sp.getRequiredParameter('sha').value
        parameters.sha = sha
        def state = sp.getParameter('state').value
        parameters.state = state
        def targetUrl = sp.getParameter('targetUrl').value
        parameters.targetUrl = targetUrl
        def mimic = sp.getParameter('mimic').value
        parameters.mimic = mimic
        def description = sp.getParameter('description').value
        parameters.description = description

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: dd4e5e5cc72fca83c3c34ea8df0857f8 ===
