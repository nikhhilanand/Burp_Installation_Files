[
  {
    "ProfileName": "GitFinder",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,/.git",
      "true,/.git-rewrite",
      "true,/.git/HEAD",
      "true,/.git/config",
      "true,/.git/index",
      "true,/.git/logs/",
      "true,/.git_release",
      "true,/.gitattributes",
      "true,/.gitconfig",
      "true,/.gitignore",
      "true,/.gitk",
      "true,/.gitkeep",
      "true,/.gitmodules",
      "true,/.gitreview",
      "true,/.git/logs/HEAD"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,ref: refs/",
      "true,Or,[core]"
    ],
    "Tags": [
      "All",
      "Fuzzing Files"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": true,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": true,
    "ResponseCode": "200",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 1,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "GitFinder",
    "IssueSeverity": "Low",
    "IssueConfidence": "Firm",
    "IssueDetail": "References:\u003cbr/\u003e\u003cbr/\u003e\n* https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/Insecure%20Source%20Code%20Management\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      66,
      64
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]