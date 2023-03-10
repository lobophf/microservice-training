curl -X POST -H "Content-Type: application/json" -d '{
        "orderLineItemsDtoList": [{"skuCode": "12312", "price": "2.71", "quantity": "2"}]
      }' http://localhost:8082/api/order
