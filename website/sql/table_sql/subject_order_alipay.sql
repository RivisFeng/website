/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 14/05/2018 18:44:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for subject_order_alipay
-- ----------------------------
DROP TABLE IF EXISTS `subject_order_alipay`;
CREATE TABLE `subject_order_alipay`  (
  `order_alipay_id` bigint(18) NOT NULL COMMENT '支付宝订单ID',
  `subject_order_id` bigint(18) DEFAULT NULL COMMENT '订单ID',
  `order_alipay_user_id` bigint(18) DEFAULT NULL COMMENT '用户ID',
  `order_alipay_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '支付宝订单状态',
  `order_alipay_create_time` datetime(0) DEFAULT NULL COMMENT '支付宝订单创建时间',
  PRIMARY KEY (`order_alipay_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '支付宝订单' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
