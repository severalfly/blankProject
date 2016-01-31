#_*_coding:utf-8_*_
'''
	输入站点的中文名，得到相应的三字码，2015-12-31 为专车做的
	注意：输入时不包含站字，分隔符为半角逗号，如
	,北京南,北京西,

	@Author leon
	@date 2015-12-31
'''
import re
import urllib.request as req
reg1 = r'\'(.*)\''

url = 'https://kyfw.12306.cn/otn/resources/js/framework/station_name.js'
html = req.urlopen(url).read().decode('utf-8')
html = re.findall(reg1, html)



stations = html[0].split('@') 
mm = {}
for station in stations:
	if len(station) <1:
		continue
	ll = station.split('|')
	if len(ll) > 0:
		mm[ll[1]] = ll[2]





line = input('please input stations with chinese name, 例如（北京西hisStat）(split by ",")\n')
inStations = line.split(",")
result = ''
for insta in inStations:
	if len(insta) <1:
		continue
	result += mm[insta] +','

print(result)

i = input()

