# object-model
CIM object-model repository

Version 1.4.8:

-- mediaRoutingDomain in ChannelType changed to String from UUID

-- routingObjectId in RoutingPolicy changed to String from Object

-- id in RoutingAttribute changed to String from UUID

===============================================================

Version 1.5.0:

 -- Added PullModeList class
 
 -- Added PullModeListEvent enum
 
 -- ChannelSession object added in customer topic
 
 -- `CREATED`  and `INACTIVE` states added inTopicState enum  
 

===================================================================

Version 1.5.1:


 -- renamed 'channelConnectorData' to 'connectorConfig' in ChannelConnector Class

 -- added new attribute 'additionalConfig' in Channel Class

 -- updated 'channelConfigSchema' Type to ObjectId and removed @DBRef annotation

 -- corrected FormData attribute name from 'form' to 'formId'


===================================================================

Version 1.5.2


 -- Updated FormData 'id' type to ObjectId
 
 -- Updated FormData Constructor 

 

====================================================================

Version 1.5.3


 -- removed 'channelConfigSchema' from ChannelType
  
 -- added @Indexed for 'typeName' in ChannelType

 -- added 'channelType' as Referenced Object in Channel

