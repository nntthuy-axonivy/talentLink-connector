# TalentLink Connector
Axon Ivy’s TalentLink connector helps you accelerate your process automation initiatives by integrating TalenLink with your process application in the shortest possible time.

This connector:

-	Is based on REST and SOAP webservice technologies.
-	Gives you access to sample TalentLink functionality
-	reduces the integration effort to a minimum: Use the demo implementation, there you will find examples for the calls

## Demo

1. Call test process. It returns test data in log to you.

## Setup

Before any interactions between the Axon Ivy Engine and TalentLink services can be run, they have to be introducted to each other. This can be done as follows:

1. Get a TalentLink account `host-name`, `user-name`, `password` and `api_key` to use.

1. Override the global variables for `host-name`, `user-name`, `password` and `api_key` in the demo project as shown in the example below.

```
Variables:
  
  talentlink-connector:
  
    host: <myhost>
    
    username: <myuser>
  
    # [password]
    password: <mypass>
    
    apikey: <myapikey>
```


