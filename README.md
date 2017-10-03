# spring-cloud-config-server-voult

#### To start vault Server in development mode
d:\>vault server -dev
#### Set env variable in new cmd/Terminal window
d:\>set VAULT_ADDR=http://127.0.0.1:8200

#### To write secret Note: where vault exe exist
d:\>vault write secret/myapp username=root
#### To write multiple secret
d:\>vault write secret/myapp username=root password=12345

#### To read secret
vault read secret/myapp

#### To call you have to pass token in request header (Refer vault server terminal to get client token)

x-Config-Token    d0d044b0-6901-2171-6ab7-6efed5834599
