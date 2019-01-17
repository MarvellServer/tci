#!groovy
// Polls linux-next for changes, builds kernel, runs boot tests.

script {
    library identifier: "tci@master", retriever: legacySCM(scm)
}

kernelTrigger {
    git_url = 'https://git.kernel.org/pub/scm/linux/kernel/git/next/linux-next.git'
}
