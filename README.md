# dropshipping-test
## Business context
Client sending some request to [API](https://dropshipping.thredup.com/docs/swagger-ui/index.html#/)
We want to process request asynchronously with some throtling and pre-conditions
Event examples:
- Listing an item
  - Upload image to CDN
  - Generate similarity vector
  - List on core platform
- Update item
  - Pre-condition: item must be listed
- Delete an item
  - Pre-condition: item must be listed
How could we implement this? What's data model based on example of item listing.

## Task
We have defined events and processor<br />
In main class present sequential processing of events

## V1 updates
- Pre-condition for event
  - Photo upload
    - Process only if `state == pending`
  - Item creation
    - Process only if `state == photo_uploaded` OR photo with same name was already uploaded
- 5 items limit for listing process.