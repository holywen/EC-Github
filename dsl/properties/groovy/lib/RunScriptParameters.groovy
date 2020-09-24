
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class RunScriptParameters {
    /**
    * Label: Script, type: textarea
    */
    String script

    static RunScriptParameters initParameters(StepParameters sp) {
        RunScriptParameters parameters = new RunScriptParameters()

        def script = sp.getRequiredParameter('script').value
        parameters.script = script

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: 48655b56507c428bd5f1386edd65cfb9 ===
