def call(svn, local = './', credentialsId) {
    checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[credentialsId: credentialsId, depthOption: 'infinity', ignoreExternalsOption: true, local: local, remote: svn]], workspaceUpdater: [$class: 'UpdateWithCleanUpdater']])
    sh "cd ${local} && svn upgrade"
}
