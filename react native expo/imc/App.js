import React, { useState } from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, TextInput, Alert, TouchableOpacity } from 'react-native';

export default function App() {
  const [height, setHeight] = useState('')
  const [weight, setWeight] = useState('')
  const [result, setResult] = useState('0')

  function calculateImc() {
    const imcValue = (weight / (height * height)).toFixed(2)

    return setResult(imcValue)
  }

  function validationImc() {
    if (height != '' && weight != '') {
      if (height >= 1 && weight >= 1) {
        calculateImc()
      } else {
        Alert.alert('Por favor preencha devidamente os campos.')
      }
    } else {
      Alert.alert('Por favor preencha devidamente os campos.')
    }

    return
  }


  return (
    <View style={styles.container}>
      <View style={styles.topBox}>
        <Text style={styles.text}>CALCULAR IMC</Text>
      </View>

      <View style={styles.mainBox}>
        <View style={styles.inputBox}>
          <View style={styles.inputField}>
            <Text>Peso</Text>
            <TextInput style={styles.input}
              onChangeText={setWeight}
              keyboardType='numeric'
              placeholder='EX: 70'
              value={weight}
            />
          </View>
          <View style={styles.inputField}>
            <Text>Altura</Text>
            <TextInput style={styles.input}
              placeholder='EX: 1.70'
              keyboardType='numeric'
              onChangeText={setHeight}
              value={height}
            />
          </View>
          <View style={styles.buttonField}>
            <TouchableOpacity
              style={styles.button}
              onPress={() => validationImc()}>
              <Text style={styles.buttonText}>CALCULAR</Text>
            </TouchableOpacity>
          </View>
          <View style={styles.resultField}>
            <Text>Resultado:</Text>
            <Text style={styles.resultText}>{result}</Text>
          </View>
        </View>
      </View>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },

  text: {
    fontWeight: '500',
    fontSize: 20,
    color: '#000',
    marginBottom: 30,
  },

  topBox: {
    display: 'flex',
    justifyContent: 'flex-end',
    flex: 1,
  },

  mainBox: {
    alignItems: 'center',
    width: '100%',
    flex: 2,
    backgroundColor: '#eeeeee',
    borderTopLeftRadius: 50,
    borderTopRightRadius: 50
  },

  inputField: {
    display: 'flex',
    gap: 10,
  },

  inputBox: {
    marginTop: 30,
    display: 'flex',
    flexDirection: 'column',
    gap: 30,
  },

  input: {
    width: 250,
    backgroundColor: '#cccccc',
    padding: 10,
    borderRadius: 10,
  },

  buttonField: {
    marginTop: 20,
  },

  buttonText: {
    color: '#fff',
    fontWeight: '800',
  },

  button: {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    height: 50,
    width: 250,
    backgroundColor: '#000',
    shadowColor: "#000",
    shadowOffset: {
      width: 0,
      height: 5,
    },
    shadowOpacity: 0.36,
    shadowRadius: 6.68,
    elevation: 11,
    borderRadius: 10,
  },

  resultField: {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    gap: 10,
  },

  resultText: {
    fontSize: 40,
  },

});
