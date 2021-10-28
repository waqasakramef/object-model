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


 ==================================================================
 
Version 1.5.4


 -- added 'CustomerWidgetConfig' Class

 -- added 'WidgetTheme' Enum
 
 -- added 'Language' Class
 
  ==================================================================
  
 Version 1.5.5
 
  -- Data type of `value` changed from `String` to `Object` in `Attribute`  
 
  -- Data type of `intent` changed from `NLUIntent` to `String` in `MessageHeader`
  
  -- `MessageType` enum item `NOTIFICATIONS` changed to `NOTIFICATION`
  
  -- `MessageIntent` enum added
    


  ======================================================================
  
 Version 1.5.8

 -- Added 'ChannelProviderInterface' Class

 -- Renamed 'typeName' to 'name' in ChannelType

 -- Updated Data type of 'id' form UUID to ObjectId in ChannelType
 
 -- Removed 'channelConnectorInterface' and 'interfaceAddress' attributes from channel connector 

 -- Removed 'channelType' from ChannelConnector

 -- Removed 'connectorConfigs' from ChannelConnector
 
 -- Added 'ChannelProviderInterface' with Referenced relation in ChannelConnector
 
 -- Added 'channelProviderConfigs' in ChannelConnector
 
 -- Renamed 'channelConnectorName' to 'name' in ChannelConnector
 
 -- Updated Data type of 'id' form UUID to ObjectId in ChannelConnector
 
 -- Removed 'additionalConfig' from Channel
 
 -- Renamed 'channelName' to 'name' in Channel
 
 -- Updated Data type of 'id' form UUID to ObjectId in Channel
 
 -- Updated 'AlphanumSpecial200' in ValueType Enum
 
   ======================================================================
   
 Version 1.5.9

 -- `additionalAttributesa` variable type changed from `List<KeyValuePair>` to `List<Attribute>` in `ChannelData` Class
 
 