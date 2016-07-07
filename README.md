****************************************************
说明文档 https://travis-ci.org/anyangxaut/TaxiPricing.svg?branch=master
****************************************************

## 问题描述

考虑出租车计价问题，出租车的运价是每公里0.8元，八公里起会加收50%的每公里运价，起步价是两公里以内6块，停车等待时加收每分钟0.25元，最后计价的时候司机会四舍五入只收块块钱。

## 思路说明

	Level1: Price = 6  when 0 < distance <= 2;
	Level2: Price = 0.8 * (distance - 2) + 6  when 2 < distance <= 8;
	Level3: Price = 0.8 * (distance - 2) + 6 + 0.4 * (distance - 8)  when distance > 8;


