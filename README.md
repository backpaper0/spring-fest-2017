# Spring Fest 2017のうらがみ発表資料とサンプル

## サンプル

* sample1 ... クライアントと、認可サーバー兼リソースサーバー
* sample2 ... クライアントと、認可サーバー
* sample3 ... クライアントと、認可サーバーと、リソースサーバー
* sample4 ... Spring Security 5のクライアント

## ぜんぶgradlew eclipseする

```console
for i in `ls -d sample*/*`;do $i/gradlew -p $i eclipse;done
```

