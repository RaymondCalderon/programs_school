import requests

datos={'user': 'Raymond','pass':'1234'}
url="http://localhost/SOA/index.php?"

r = requests.post(url, data = datos)
#get params, post data

print(r)
print(r.url)
print(r.text)
print(r.json)