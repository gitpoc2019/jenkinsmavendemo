{
  "id": "2e6aa940-68fa-4c57-b611-91b42732f48b",
  "version": "2.0",
  "name": "Learningjava",
  "url": "https://www.qtpselenium.com",
  "tests": [{
    "id": "10895d70-c998-46d3-bb9c-ac517c118fe9",
    "name": "exercise2",
    "commands": [{
      "id": "bc8445d3-083b-4689-8932-50dbccc3ac46",
      "comment": "",
      "command": "open",
      "target": "/",
      "targets": [],
      "value": ""
    }, {
      "id": "34a2b00c-3716-4ca5-800a-5a6d98e7cdec",
      "comment": "",
      "command": "setWindowSize",
      "target": "1536x824",
      "targets": [],
      "value": ""
    }, {
      "id": "db280c59-13d6-49ec-aca7-83632c60a3b5",
      "comment": "",
      "command": "click",
      "target": "linkText=SIGN IN",
      "targets": [
        ["linkText=SIGN IN", "linkText"],
        ["css=.btn", "css:finder"],
        ["xpath=//a[contains(text(),'SIGN IN')]", "xpath:link"],
        ["xpath=//a[contains(@href, 'https://www.qtpselenium.com/login')]", "xpath:href"],
        ["xpath=//li[4]/a", "xpath:position"],
        ["xpath=//a[contains(.,'SIGN IN')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "1e72314e-1237-428e-862f-6186176b18a9",
      "comment": "",
      "command": "click",
      "target": "css=.box-main",
      "targets": [
        ["css=.box-main", "css:finder"],
        ["xpath=//div/div/div[2]/div", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "79920697-bc20-4a9c-8103-d7376a9f1a02",
      "comment": "",
      "command": "type",
      "target": "name=username",
      "targets": [
        ["name=username", "name"],
        ["css=.form-group:nth-child(2) > .form-control", "css:finder"],
        ["xpath=//input[@id='']", "xpath:attributes"],
        ["xpath=//div[2]/input", "xpath:position"]
      ],
      "value": "asdasd"
    }, {
      "id": "f0e8d97f-d574-468e-8fc3-04cc92f1b77a",
      "comment": "",
      "command": "click",
      "target": "css=.box-main",
      "targets": [
        ["css=.box-main", "css:finder"],
        ["xpath=//div/div/div[2]/div", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "44542207-7bef-4ef1-923b-e6131f7c7709",
      "comment": "",
      "command": "type",
      "target": "name=password",
      "targets": [
        ["name=password", "name"],
        ["css=.form-group:nth-child(3) > .form-control", "css:finder"],
        ["xpath=(//input[@id=''])[2]", "xpath:attributes"],
        ["xpath=//div[2]/div/form/div[3]/input", "xpath:position"]
      ],
      "value": "sdfsdgfdsg"
    }, {
      "id": "c8f40b2d-2bdc-4c52-90ca-7cce47d02de5",
      "comment": "",
      "command": "click",
      "target": "css=.btn-default",
      "targets": [
        ["css=.btn-default", "css:finder"],
        ["xpath=//button[@type='submit']", "xpath:attributes"],
        ["xpath=//div[4]/button", "xpath:position"],
        ["xpath=//button[contains(.,'Login')]", "xpath:innerText"]
      ],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "e7e7b17b-dd6c-4b64-87bb-4dc2bf246a5c",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["10895d70-c998-46d3-bb9c-ac517c118fe9"]
  }],
  "urls": ["https://www.qtpselenium.com/"],
  "plugins": []
}