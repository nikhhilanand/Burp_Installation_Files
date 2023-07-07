[
  {
    "ProfileName": "OpenRedirect",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,http://burpbounty.net",
      "true,//burpbounty.net",
      "true,http:burpbounty.net",
      "true,///burpbounty.net",
      "true,\\/\\/burpbounty.net",
      "true,//burpbounty%E3%80%82net",
      "true,http://burpbounty.net\\\\@{CURRENT_HOST}/",
      "true,{CURRENT_PROTOCOL}://{CURRENT_HOST}.burpbounty.net",
      "true,{CURRENT_PROTOCOL}://{CURRENT_HOST}@burpbounty.net"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,http-equiv\u003d\"refresh\" content\u003d\".*url\u003d.http:\\/\\/burpbounty\\.net",
      "true,Or,location\\.replace\\(.http:\\/\\/burpbounty\\.net",
      "true,Or,Location:\\shttp:\\/\\/burpbounty\\.net",
      "true,Or,Location:\\s\\/\\/burpbounty\\.net",
      "true,Or,Location:\\shttp:burpbounty\\.net",
      "true,Or,http-equiv\u003d\"refresh\" content\u003d\".*url\u003d.\\/\\/burpbounty\\.net",
      "true,Or,http-equiv\u003d\"refresh\" content\u003d\".*url\u003d.http:burpbounty\\.net",
      "true,Or,location\\.replace\\(.\\/\\/burpbounty\\.net",
      "true,Or,location\\.replace\\(.http:burpbounty\\.net",
      "true,Or,location\\.replace\\(.\\/\\/\\/burpbounty\\.net",
      "true,Or,http-equiv\u003d\"refresh\" content\u003d\".*url\u003d.\\/\\/\\/burpbounty\\.net",
      "true,Or,Location:\\s\\/\\/\\/burpbounty\\.net",
      "true,Or,Location:\\s\\\\\\/\\\\\\/burpbounty\\.net",
      "true,Or,location\\.replace\\(.\\\\\\/\\\\\\/burpbounty\\.net",
      "true,Or,http-equiv\u003d\"refresh\" content\u003d\".*url\u003d.\\\\\\/\\\\\\/burpbounty\\.net",
      "true,Or,location\\.replace\\(.\\/\\/burpbounty",
      "true,Or,http-equiv\u003d\"refresh\" content\u003d\".*url\u003d.\\/\\/burpbounty",
      "true,Or,Location:\\s\\/\\/burpbounty"
    ],
    "Tags": [
      "All",
      "Open Redirect"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 5,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "OpenRedirect",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      18,
      65,
      70,
      80,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      21,
      31,
      41,
      51,
      61,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      36,
      81,
      82
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]