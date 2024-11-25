# TalentLink Connector

[TalentLink](https://developer.lumesse-talenthub.com/) is a cloud-based recruitment and talent acquisition platform by Lumesse (now part of Cornerstone OnDemand). It streamlines the hiring process, from job postings to candidate management, screening, and reporting. TalentLink helps companies efficiently manage talent acquisition and automate HR processes.

This connector:

-	is based on REST and SOAP webservice technologies.
-	gives you access to sample TalentLink functionality

## Demo

Call test process. It returns test data in log to you.

## Setup

Before any interactions between the Axon Ivy Engine and TalentLink services can be run, they have to be introduced to each other. This can be done as follows:

1. Get a TalentLink account `host-name`, `user-name`, `password` and `api_key` to use.

2. Override the variables for `host-name`, `user-name`, `password` and `api_key` in the demo project as shown in the example below.

```
Variables:
  
  talentlink-connector:
  
    host: <myhost>
    
    username: <myuser>
  
    # [password]
    password: <mypass>
    
    apikey: <myapikey>
```


