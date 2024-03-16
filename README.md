Write a Spring Boot application with the necessary dependencies that:
- has 2 controllers:
BasicController that: is mapped on time and returns the current date/time; and LegacyController that: is mapped on legacy and returns "This is just old code".
- has 2 interceptors/middleware: APILoggingInterceptor that prints in the console the requests header User-Agent, before handling them; and LegacyIntercepotr that: blocks the API calls to the legacy endpoint and returns a response with the right HTTP code status for Gone.
- test the 2 API endpoint calls using Postman
