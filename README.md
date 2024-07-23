# dropshipping-test

We have defined events and processor<br />
In main class present sequential processing of events

## V1 updates
- Pre-condition for event
  - Photo upload
    - Process only if `state == pending`
  - Item creation
    - Process only if `state == photo_uploaded` OR photo with same name was already uploaded
- 5 items limit for listing process.