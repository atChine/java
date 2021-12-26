#所谓“水仙花数”是指一个三位数
#其各位数字立方和等于该数本身
#例如：153是一个“水仙花数”，因为153= 1的三次方 +5的三次方 +3的三次方
name = input('请输入一个三位数')
print(type(name))
#转化成数字
name = int(name)
print(type(name))
#取百位
i = int(name/100)
print('百位',i)
#取十位
j=int(name/10%10)
print('十位',j)
#取个位
k=int(name%10)
print('个位',k)
result = i*i*i +j*j*j +k*k*k
print('result',result)
if result==name:
    print('是水仙花数')
else:
    print('不是水仙花数')