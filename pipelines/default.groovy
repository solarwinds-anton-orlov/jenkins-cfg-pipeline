def config = readYaml text: "${env.PIPELINE_CONFIG}"
assert config.version =~ /[\d]+\.[\d]+/
library "mpl-nested@v${config.version}"
MPLScripted()
